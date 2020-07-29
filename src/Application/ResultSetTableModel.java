
package Application;
import java.sql.*;
import javax.swing.table.AbstractTableModel;

public class  ResultSetTableModel extends AbstractTableModel{
    //declaration
    private ResultSet rs; 
    
    
    public ResultSetTableModel(ResultSet rs){
        this.rs = rs;
      fireTableDataChanged();
    }
    // foction getColumnCount
    
    public int getColumnCount(){
        try{
            if(rs==null){
                return 0;
                
            }else
            {
                return rs.getMetaData().getColumnCount();
            }
        }catch(SQLException e)
        {
            System.out.println("getColumnCount . resultset generating error while getting column count");
            System.out.println(e.getMessage());
            return 0;
            
        }
    }
    // foction getRowCount
    
    public int getRowCount(){
        try{
            if(rs==null){
                return 0;
            } else{
                rs.last();
                return rs.getRow();
            }
        
        }catch(SQLException e)
        {
            System.out.println("getRowCount resultset generating error while getting rows count");
            System.out.println(e.getMessage()); 
            return 0;
        }
    }
    // getValueAt
    
    public Object getValueAt(int rowIndex, int columnIndex){
        if(rowIndex < 0 || rowIndex > getRowCount()|| columnIndex < 0 || columnIndex > getColumnCount()){
            return null;
        }
        try{
        if(rs== null){
            return null;
        } else {
            rs.absolute(rowIndex + 1);
            return rs.getObject(columnIndex + 1);//pour genere les colonne
        }
        }catch(SQLException e){
            System.out.println("getvalueat resultset generating error while fetching row");
            System.out.println(e.getMessage());
            return null;
        }
    }
    //fonction getColumnName
    @Override
     public String getColumnName(int columnIndex){
         try{
             return rs.getMetaData().getColumnName(columnIndex + 1);
         }catch(SQLException ex)
         {
            System.out.println("getColumnCountname resultset generating error while gfetching column count");
            System.out.println(ex.getMessage());
         }
         return  super.getColumnName(columnIndex);
     }
}