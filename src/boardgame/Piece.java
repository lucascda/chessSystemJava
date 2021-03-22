package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	/* Uma peça recém criada possui posição nula,
	 * por isso o construtor recebe apenas o tabuleiro */
	public Piece(Board board) {
		
		this.board = board;
		
		/* Por padrão a propriedade position irá ser nula
		 * assim que a classe for instanciada em um objeto */
		
		// this.position = null;
	}
	
	/* Somente classes de um mesmo pacote ou sub-classes
	 * poderão acessar o método */
	protected Board getBoard() {
		return board;
	}

	
	
	

}
