package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Agresividad;

public class Aguila extends Animal implements Agresividad{

	public Aguila(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Aguila", "Las crias nacen de huevos", "Omnivoro", "Agresivo", "Aereo", 5);
		
	}

	@Override
	public String agresivo() {
		return "Ten cuidado con las aguilas, pueden ser peligrosas!!!"; }

}
