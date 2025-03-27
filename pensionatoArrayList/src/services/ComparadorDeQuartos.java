package services;

import java.util.*;

import entidades.Room; //para alterar as propriedades na classe ROOM

/*essa classe implementa a interface Comparator, precisa ser escrita
 * separadamente e permite ordenar a lista <Room> pelo número dos quartos*/

public class ComparadorDeQuartos implements Comparator<Room>{
	public int compare(Room obj1, Room obj2) {
		if(obj1.numberOfRoom < obj2.numberOfRoom) {
			return -1;
		}
		else {
			if(obj1.numberOfRoom < obj2.numberOfRoom) {
				return +1;
			}
			else return 0;
		}
	}
}
