/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalla.naval;

/**
 *
 * @author hp
public class BattleShip {
	
	private ArrayList<Player> jugadores;
	private Player jugador1;
	private Player jugador2;
	private int dificultad;//1-EASY, 2-NORMAL, 3-EXPERT, 4-GENIUS
	private int modo; //1-TUTORIAL, 2-ARCADE
	private Tablero tablero1;
	private Tablero tablero2;
	
	public BattleShip() {
		jugadores = new ArrayList<Player>();
		jugador1 = null;
		jugador2 = null;
		dificultad = 2; //Dificultad por defecto
		modo = 1; //Modo de juego por defecto
		tablero1 = new Tablero();
		tablero2 = new Tablero();
	}
	
	
	/**
	 * Recibe un Player para añadir al listado.<br>
	 * El Player será rechazado si ya existe otro con el mismo nombre.
	 * @param jugador Objeto Player que queremos registrar.
	 * @return <i>True</i> si se admitó el registro,
	 * <i>False</i> si ha sido rechazado.
	 */
	public boolean addPlayer(Player jugador) {
		if (jugadores.contains(jugador)) {
			JOptionPane.showMessageDialog(null, "Este Jugador ya está registrado", "Nuevo Jugador",
					JOptionPane.WARNING_MESSAGE);
			return false; //Ya existe este Player, lo rechazamos
		}
		else
			return jugadores.add(jugador);
	}
	
	

}
