
import edu.uniciencia.directorio.datos.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ModeloTablaPersona extends AbstractTableModel {

    private List<Persona> lista = new ArrayList<>();
    private String[] columnas = new String[]{"Nombre", "Apellido"};

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona p = lista.get(rowIndex);
        if (columnIndex == 0) {
            return p.getNombres();
        }
        if (columnIndex == 1) {
            return p.getApellidos();
        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }

}
