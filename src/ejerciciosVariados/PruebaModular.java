class PruebaModular{
	public Integer hash(Integer k){
		Integer key=0;
		key=Math.abs(k)%13;
		return key;
	}
	public void insertar(Integer k){
		System.out.println(k+" tiene el hash "+ hash(k));

	}
	public static void main(String[] args) {
		//Integer valor = -50;
		//Integer res = (valor&0x7fffffff)%13;
		PruebaModular hashTable = new PruebaModular();
		for (int i=-50; i<=50; i++) {
			hashTable.insertar(i);			
		}
	}
}

