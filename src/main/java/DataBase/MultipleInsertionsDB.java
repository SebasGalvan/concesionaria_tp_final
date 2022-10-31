package DataBase;


public class MultipleInsertionsDB<T>{

    static String SQL_INSERT = "INSERT INTO autores(`nombre`, `apellido`, `seudonimo`, `genero`, `fecha_nacimiento`, `pais_origen`) VALUES (?,?,?,?,?,?)";

//    static void setProperty(PreparedStatement statement, Autor autor) throws SQLException {
//        statement.setString(1, autor.getNombre());
//        statement.setString(2, autor.getApellido());
//        statement.setString(3, autor.getSeudonimo());
//        statement.setString(4, autor.getGenero());
//        statement.setString(5, autor.getFecha_nacimiento());
//        statement.setString(6, autor.getPais_origen());
//    }
//
//    public static void save(List<Autor> autores) throws SQLException {
//
//        Conexion cn = new Conexion();
//        try (Connection conexion = cn.getConexion()) {
//
//            PreparedStatement statement = conexion.prepareStatement(SQL_INSERT);
//            int i = 0;
//
//            for (Autor autor : autores) {
//
//                setProperty(statement, autor);
//
//                statement.addBatch();
//                i++;
//
//                if (i % 10 == 0 || i == autores.size()) {
//                    System.out.println("Se insertaron " + i + " registros ... ");
//                    statement.executeBatch();
//
//                }
//            }
//        }
//    }
    }
