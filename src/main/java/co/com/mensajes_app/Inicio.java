package co.com.mensajes_app;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class Inicio 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Conexion conexion = new Conexion();
        try (Connection cnx = conexion.get_connection()) {
        
			
		} catch (Exception e) {
			System.out.println(e);
		}
    }
}
