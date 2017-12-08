import java.util.ArrayList;


public class Main {

	/**
	 * Basics of Blockchain simplified: https://www.youtube.com/watch?v=A1Vbrxkqjwc
	 * A digital signature is nothing but a hash
	 * Blockchain consists of blocks and each block contains:-
	 * 	-List of transactions in banks/vote counting system/supply chain of goods
	 *  -Previous hash
	 *  -Current hash
	 */
	
	ArrayList<Block> blockchain=new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] genesisTransaction={"Rohan sent me 5 bitcoins","I sent kk 2 bitcoins"};
		Block genesisBlock=new Block(0, genesisTransaction);
		
		String[] block2Transactions={"I sent kancha 3 bitcoins", "Kancha sent rohan 1 bitcoin"};
		Block block2=new Block(genesisBlock.getBlockHash(),block2Transactions);
		System.out.println(genesisBlock.getBlockHash());
		System.out.println(block2.getBlockHash());
		
	}

}
