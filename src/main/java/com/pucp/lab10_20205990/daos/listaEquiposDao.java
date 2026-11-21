package com.pucp.lab10_20205990.daos;

import com.pucp.lab10_20205990.dtos.ListadoDeEquiposDto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class listaEquiposDao extends BaseDao{

    public ArrayList<ListadoDeEquiposDto> listaEquipos(){

        ArrayList<ListadoDeEquiposDto> lista = new ArrayList<>();

        String sql = "select hostname,tipo,ip_gestion,estado,fecha_alta\n" +
                "from equipos_red e\n" +
                "inner join sedes s on (e.idSede = s.idSede)\n" +
                "order by e.idEquipo";

        try(Connection conn = this.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while(rs.next()){
                ListadoDeEquiposDto lst = new ListadoDeEquiposDto();
                lst.setIdEquipo(rs.getInt(1));
                lst.setHostname(rs.getString(2));
                lst.setTipo(rs.getString(3));
                lst.setIpGestion(rs.getString(4));
                lst.setEstado(rs.getString(5));
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }

        return lista;
    }

}
