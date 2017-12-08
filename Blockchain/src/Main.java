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
		String[] genesisTransaction={"John sent me 5 bitcoins","I sent Kate 2 bitcoins"};
		Block genesisBlock=new Block(0, genesisTransaction);
		
		String[] block2Transactions={"I sent Ron 3 bitcoins", "John sent rohan 1 bitcoin"};
		Block block2=new Block(genesisBlock.getBlockHash(),block2Transactions);
		
		String[] block3Transactions={"kate sent Ron 1 bitcoins", "Ron sent me 1 bitcoin"};
		Block block3=new Block(block2.getBlockHash(),block3Transactions);
		
		//Changes in any of the previous block leads to changes in the hash value of next block.
		//Thus any misrepresentations with the previous data can be easily detected by matching
		//the hash value of the most recent block across various blockchains.
		System.out.println(genesisBlock.getBlockHash());
		System.out.println(block2.getBlockHash());
		System.out.println(block3.getBlockHash());
		
	}

}
