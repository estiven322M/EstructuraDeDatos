
public class Profesor extends Persona implements Empleado{

	@Override
	public void cobrarSueldo() {
		System.out.println("El docente identificado con C.C :"+getCedula()+" cobro su sueldo por: "+salarioMinimo*2.5);
		
	}

	@Override
	public void pagarImpuesto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asistirReunion() {
		// TODO Auto-generated method stub
		
	}
	
	

}
