/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Lil
 */
public class TMEstudiante implements TableModel{
    private List <Estudiante> est;
    
    public TMEstudiante (List<Estudiante> Lista){
        est=Lista;
    }
    @Override
    public int getRowCount() {
        return est.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public String getColumnName(int columnIndex) {
        
        String titulo=null;
        switch(columnIndex){
            case 0:{
                titulo="Nro_de_ID";
                break;
            }
             case 1:{
                titulo="Nombres";
                break;
            }
              case 2:{
                titulo="Apellidos";
                break;
            }
               case 3:{
                titulo="Laboratorio";
                break;
            }
                case 4:{
                titulo="Carrera";
                break;
            }
                 case 5:{
                titulo="Modulo";
                break;
            }
                 case 6:{
                titulo="Materia";
                break;
            }
                 case 7:{
                titulo="Fecha";
                break;
            }
                 case 8:{
                titulo="Hora_Ingreso";
                break;
            }
                 case 9:{
                titulo="Hora_Salida";
                break;
            }
                
        }
        return titulo;
      
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estudiante estu= est.get(rowIndex);
        String valor=null;
        
        switch(columnIndex){
            case 0:{
               valor=estu.getNro_de_ID();
                break;
            }
             case 1:{
                valor=estu.getNombres();
                break;
            }
              case 2:{
                valor=estu.getApellidos();
                break;
            }
               case 3:{
               valor=estu.getLaboratorio();
                break;
            }
                case 4:{
                valor=estu.getCarrera();
                break;
            }
                 case 5:{
                valor=estu.getModulo();
                break;
            }
                 case 6:{
                valor=estu.getMateria();
                break;
            }
                 case 7:{
                valor=estu.getFecha();
                break;
            }
                 case 8:{
                valor=estu.getHora_Ingreso();
                break;
            }
                 case 9:{
                valor=estu.getHora_Salida();
                break;
            }
                                 

                
        }
        return valor;
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       //sirve si en caso modifica de la tabla
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }

    
    
}


