package practica;

public class dylan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double arealateral,g,Abase,areaTotal,volumen,h, Pbase,r;
		h=2;
		r=8;
		
		g=Math.sqrt(Math.pow(h,2)*Math.pow(r,2));
		
		 arealateral= (Math.PI)*r+h;
		 
		 areaTotal= (Math.PI)*(g+r);
		 
		 volumen=(Math.PI)*(Math.pow(r,2))*h/3;

		
		
		
		System.out.println("datos de cono");
		System.out.println("Radio:"+ r);
		System.out.println("Altura:" + h);
		System.out.println("datos de cono");
		System.out.println("Arealateral:"+ arealateral);
		System.out.println("AreaTotal:"+ areaTotal);
		System.out.println("volumen:"+ volumen);
		
	}

}
