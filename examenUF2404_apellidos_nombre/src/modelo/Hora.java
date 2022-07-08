package modelo;

public class Hora {

public static void main(String[] args) {
		
		private int horas;
		private int minutos;
		private int segundos;
		
		public Hora() {
			super(00:00:00);
		}

		public Hora(int horas, int minutos, int segundos) {
			super();
			this.horas = horas;
			this.minutos = minutos;
			this.segundos = segundos;
				
		}


		public Hora (hora h) {
			super();
			this.horas = h.horas;
			this.minutos = h.minutos;
			this.segundos = h.segundos;
		}
		
		private static boolean Valida() {
			if (hora=h.horas , minutos=h.minutos , segundos=h.segundos) {
				return true;
			}else {
				return false;
			}
		
		

		public int getHoras() {
			return horas;
		}

		public void setHoras(int horas) {
			this.horas = horas;
		}

		public int getMinutos() {
			return minutos;
		}

		public void setMinutos(int minutos) {
			this.minutos = minutos;
		}

		public int getSegundos() {
			return segundos;
		}

		public void setSegundos(int segundos) {
			this.segundos = segundos;
		}

		}

	}

@Override
public String toString() {
	return "Hora [toString()=" + super.toString() + "]";
}


}