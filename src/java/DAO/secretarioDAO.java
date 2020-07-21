
package DAO;

import Conexiones.conexionSQL;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.citas;

/**
 *
 * @author Masiel Castro Mora
 */
public class secretarioDAO {
    public static citas citas;
    public static ResultSet result;
    

    public void cancelarCitaCentro(int pIDcita, int pIDFuncionario) throws SQLException{
        CallableStatement entrada = conexionSQL.getConnection().prepareCall("{call cancelarcitaCentro(?,?)}");
        entrada.setInt(1, pIDcita);
        entrada.setInt(2, pIDFuncionario);
        entrada.execute();
    }
    
    public void asignarCita(String pEspecialidad, String pFechaCita,String pHoraCita, String pObservacion, int pIdPaciente, int pIdFuncionario) throws SQLException{
        CallableStatement entrada = conexionSQL.getConnection().prepareCall("{call anadirCita(?,?,?,?,?,?)}");
        entrada.setString(1, pEspecialidad);
        entrada.setString(2, pFechaCita);
        entrada.setString(3, pHoraCita);
        entrada.setString(4, pObservacion);
        entrada.setInt(5, pIdPaciente);
        entrada.setInt(6, pIdFuncionario);
        entrada.execute();
    }
    
    public CallableStatement citasRegistradas(String pFecha1, String pFecha2, String pEstado, String pEspecialidad, String pNombrePaciente)throws SQLException{
        CallableStatement entrada = conexionSQL.getConnection().prepareCall("{call citasEnSistema(?,?,?,?,?)}");
        if (pFecha1.isEmpty()==true){
            entrada.setNull(1, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(1, pFecha1);
        }
         if (pFecha2.isEmpty()==true){
            entrada.setNull(2, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(2, pFecha2);
        }
         if (pEstado.isEmpty()==true){
            entrada.setNull(3, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(3, pEstado);
        }
         if (pEspecialidad.isEmpty()==true){
            entrada.setNull(4, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(4, pEspecialidad);
        }
         if (pNombrePaciente.isEmpty()==true){
            entrada.setNull(5, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(5, pNombrePaciente);
        }
      return entrada;
             
    }
    
    public CallableStatement hospitalizacionesRegistradas(String pFechaIni1, String pFechaInicial2, String pFechaFinal1, String pFechaFinal2, String pEstado, String pEspecialidad, String pNombrePaciente) throws SQLException{
        CallableStatement entrada = conexionSQL.getConnection().prepareCall("{call hospitalizacionesRegistradas(?,?,?,?,?,?,?)}");
        if (pFechaIni1.isEmpty()==true){
            entrada.setNull(1, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(1,pFechaIni1);
        }
        if (pFechaInicial2.isEmpty()==true){
            entrada.setNull(2, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(2,pFechaInicial2);
        }
        if (pFechaFinal1.isEmpty()==true){
            entrada.setNull(3, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(3,pFechaFinal1);
        }
        if (pFechaFinal2.isEmpty()==true){
            entrada.setNull(4, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(4,pFechaFinal2);
        }
        if (pEstado.isEmpty()==true){
            entrada.setNull(5, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(5,pEstado);
        }
        if (pEspecialidad.isEmpty()==true){
            entrada.setNull(6, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(6,pEspecialidad);
        }
        if (pNombrePaciente.isEmpty()==true){
            entrada.setNull(7, java.sql.Types.VARCHAR);
        } else {
            entrada.setString(7,pNombrePaciente);
        }
        
        return entrada;
        
    }
    
}
