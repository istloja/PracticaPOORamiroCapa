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
public class TMDocente implements TableModel {

    private List<Docente> dct;

    public TMDocente(List<Docente> Lista) {
        dct = Lista;
    }

    @Override
    public int getRowCount() {
        return dct.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public String getColumnName(int columnIndex) {

        String titulo = null;
        switch (columnIndex) {
            case 0: {
                titulo = "Nro_de_ID";
                break;
            }
            case 1: {
                titulo = "Nombres";
                break;
            }
            case 2: {
                titulo = "Apellidos";
                break;
            }
            case 3: {
                titulo = "Laboratorio";
                break;
            }
            case 4: {
                titulo = "Carrera";
                break;
            }
            case 5: {
                titulo = "Modulo";
                break;
            }
            case 6: {
                titulo = "Materia";
                break;
            }
            case 7: {
                titulo = "Fecha";
                break;
            }
            case 8: {
                titulo = "Hora_Ingreso";
                break;
            }
            case 9: {
                titulo = "Hora_Salida";
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
        Docente dcte = dct.get(rowIndex);
        String valor = null;

        switch (columnIndex) {
            case 0: {
                valor = dcte.getNro_de_ID();
                break;
            }
            case 1: {
                valor = dcte.getNombres();
                break;
            }
            case 2: {
                valor = dcte.getApellidos();
                break;
            }
            case 3: {
                valor = dcte.getLaboratorio();
                break;
            }
            case 4: {
                valor = dcte.getCarrera();
                break;
            }
            case 5: {
                valor = dcte.getModulo();
                break;
            }
            case 6: {
                valor = dcte.getMateria();
                break;
            }
            case 7: {
                valor = dcte.getFecha();
                break;
            }
            case 8: {
                valor = dcte.getHora_Ingreso();
                break;
            }
            case 9: {
                valor = dcte.getHora_Salida();
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
