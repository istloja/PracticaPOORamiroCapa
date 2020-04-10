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
public class TMEquipo implements TableModel {

    private List<Equipos> eqp;

    public TMEquipo(List<Equipos> Lista) {
        eqp = Lista;
    }

    @Override
    public int getRowCount() {
        return eqp.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public String getColumnName(int columnIndex) {

        String titulo = null;
        switch (columnIndex) {
            case 0: {
                titulo = "Tipo_de_Equipo";
                break;
            }
            case 1: {
                titulo = "Nro_de_Serie";
                break;
            }
            case 2: {
                titulo = "Marca";
                break;
            }
            case 3: {
                titulo = "Modelo";
                break;
            }
            case 4: {
                titulo = "Pertenece";
                break;
            }
            case 5: {
                titulo = "Sala_de_Ubicacion";
                break;
            }
            case 6: {
                titulo = "Estado";
                break;
            }
            case 7: {
                titulo = "Funcionamiento";
                break;
            }
            case 8: {
                titulo = "Observaciones";
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
        Equipos eqps = eqp.get(rowIndex);
        String valor = null;

        switch (columnIndex) {
            case 0: {
                valor = eqps.getTipodeEquipo();
                break;
            }
            case 1: {
                valor = eqps.getNro_de_Serie();
                break;
            }
            case 2: {
                valor = eqps.getMarca();
                break;
            }
            case 3: {
                valor = eqps.getModelo();
                break;
            }
            case 4: {
                valor = eqps.getPertenece();
                break;
            }
            case 5: {
                valor = eqps.getSala_de_Ubicacion();
                break;
            }
            case 6:{
                valor = eqps.getEstado();
                break;
            }
            case 7: {
                valor = eqps.getFuncionamiento();
                break;
            }
            case 8: {
                valor = eqps.getObservaciones();
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
