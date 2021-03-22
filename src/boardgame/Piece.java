package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	/* Uma pe�a rec�m criada possui posi��o nula,
	 * por isso o construtor recebe apenas o tabuleiro */
	public Piece(Board board) {
		
		this.board = board;
		
		/* Por padr�o a propriedade position ir� ser nula
		 * assim que a classe for instanciada em um objeto */
		
		// this.position = null;
	}
	
	/* Somente classes de um mesmo pacote ou sub-classes
	 * poder�o acessar o m�todo */
	protected Board getBoard() {
		return board;
	}

	
	
	

}
