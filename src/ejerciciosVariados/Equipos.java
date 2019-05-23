class Equipos {
	public static void main(String[] args) {
        Equipos rr = new Equipos();
        for (int i = 0; i < 9; i++) {
            rr.mostrar();
            rr.combinar();
        }  
    }
    private String[] equipos= new String[10];

    public Equipos() {
        this.equipos[0]="Madrid";
        this.equipos[1]="Barcelona";
        this.equipos[2]="Sevilla";
        this.equipos[3]="Atletico Madrid";
        this.equipos[4]="Bilvao";
        this.equipos[5]="Girona";
        this.equipos[6]="Betis";
        this.equipos[7]="Valencia";
        this.equipos[8]="Celta";
        this.equipos[9]="Villareal";
    }

    

    /*public void combinar(){             
        String buffer=equipos[equipos.length-1];
  
        for (int i = equipos.length-1; i > 1; i--) {
            equipos[i]=equipos[i-1];
        }
        equipos[1]=buffer;  
    }

    public void mostrar(){
        for (int i = 0, j=equipos.length-1; i<j; i++, j--) {
            System.out.println(equipos[i]+" vs "+ equipos[j]);
        }
        System.out.println("***********************************");
    }*/
	
}