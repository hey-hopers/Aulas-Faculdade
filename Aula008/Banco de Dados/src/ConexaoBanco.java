import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBanco {

    public static String status = "Não conectou...";
    public ConexaoBanco() {

    }

    public static java.sql.Connection getConexaoBanco() {

        Connection connection = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/mysq";
            String username = "root";
            String password = "admin";

            connection = DriverManager.getConnection(url, username, password);


            if (connection != null) {

                status = ("STATUS--->Conectado com sucesso!");

            } else {

                status = ("STATUS--->Não foi possivel realizar conexão");

            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado

            System.out.println("O driver expecificado nao foi encontrado.");
            return null;

        } catch (SQLException e) {

            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;

        }

    }

    public static String statusConection() {

        return status;

    }

    public static boolean FecharConexao() {

        try {

            ConexaoBanco.getConexaoBanco().close();

            return true;

        } catch (SQLException e) {

            return false;

        }

    }

    public static java.sql.Connection ReiniciarConexao() {

        FecharConexao();
        return ConexaoBanco.getConexaoBanco();

    }

}