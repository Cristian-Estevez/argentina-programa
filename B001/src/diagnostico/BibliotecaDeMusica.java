package diagnostico;

public class BibliotecaDeMusica {

		static public class Cancion{
			private String nombre, autor, genero;
			private int duracion; // en segundos
			private static int cantidadDeCanciones, segundosTotales;
			
			public Cancion(String nom, String aut, String gen, int dur) {
				nombre = nom;
				autor = aut;
				genero = gen;
				duracion = dur;
				cantidadDeCanciones += 1;
				segundosTotales += dur;
			}
			
			static public String getTiempoTotal() {
				if (segundosTotales < 60) {
					return ("Tienes en la colección " + segundosTotales + " segundos de música");
				} else if (segundosTotales < 3600) {
					return ("Tienes en la colección " + (int)(segundosTotales/60) + " minutos de música");
				} else {
					double min = segundosTotales / 60;
					int hs = (int) (min / 60);
					int minutos_restantes = (int) (min % 60);
					return ("Tienes en la colección " + hs + ":" + minutos_restantes + " horas de música" );
				}
			}
		}
		
		public static void main(String[] args) {
			Cancion bamba = new Cancion("la bamba", "pedro pereyra", "fiesta", 37050);
			System.out.println(Cancion.getTiempoTotal());
		}

	}