"""
Emilia tiene su biblioteca de canciones en formato mp3, y por cada canción posee su título, autor, duración (en segundos) y el género musical al que pertenece.
Emilia tiene curiosidad por saber los siguientes datos de su colección:

¿Cuál es la canción más larga?
¿Cuántas canciones tiene por género? ¿Y por autor?
¿De qué autor tiene más canciones?
¿Cuántas horas de música tiene en total?

Para ello nos pidió ayuda, ya que sabe que nos damos maña con la programación. ¿Podrían sugerir una forma de responder cada una de estas preguntas? Pueden hacerlo coloquialmente, como pseudocódigo, o también proporcionando un programa en el lenguaje de su preferencia.
"""

# tengo la información de la colección organizada de la siguiente manera :

canciones = {"nothing else matters": {"autor": "metallica", 
									  "duracion": 388, # segundos
									  "genero": "heavy metal" 
									 },
			 "remedy": {"autor": "the black crowes",
			 			"duracion": 322,
			 			"genero": "hard rock blues rock"
			 			},
			 "wish you were here": {"autor": "incubus",
			 						"duracion": 212,
			 						"genero": "alternative rock rpst-grunge"
			 						},
			 "Promises Promises": {"autor": "incubus",
			 					   "duracion": 266,
			 					   "genero": "alternative rock rpst-grunge"
					   			  }
			}



# ¿Cual es la canción mas larga?


print("____________________________________________________________\n")
def mas_larga():
	tmp = None
	nombre_cancion = ""
	for i in canciones:
		
		if tmp == None:
			tmp = canciones[i]["duracion"]
			nombre_cancion = i
		
		elif canciones[i]["duracion"] > tmp:
			tmp = canciones[i]["duracion"]
			nombre_cancion = i

	print("La canción más larga de la colección es:", nombre_cancion.title(), "y dura", tmp, "segundos.")
# llamo a la función
mas_larga()



# ¿Cuántas canciones tiene por género? ¿Y por autor?

# creo una función que reciba como parámetro el diccionario con la info de las canciones, a partir de ahí hago un listado con todos los géneros y autores existentes en la coleccion, creo contadores para cada uno e iterando sobre la colección acumulo en los contadores, y al terminar imprime por pantalla los totales.
print("____________________________________________________________\n")
def detalle(info):
	"""primer parámetro debe ser un diccionario con el formato indicado más arriba """

	autores_total = {} 
	generos_total = {}

	for i in canciones:

		autor = canciones[i]["autor"]
		genero = canciones[i]["genero"]

			# contador para cantidad de canciones en autores
		if autor not in autores_total:
			autores_total[autor] = 1
		else:
			autores_total[autor] += 1

		# contador para cantidad de canciones en género
		if genero not in generos_total:
			generos_total[genero] = 1
		else:
			generos_total[genero] += 1

	# imprimir autores
	print("Cantidad de canciones por autor:\n")
	for v, k in autores_total.items():
		print(v.capitalize(), ": ", k)
	print("____________________________________________________________\n")

	# imprimir generos
	print("Cantidad de canciones por género:\n")
	for v,k in generos_total.items():
		print(v.capitalize(), ": ", k)
	

# llamo a la función
detalle(canciones)
print("____________________________________________________________\n")



# ¿De qué autor tiene más canciones?

def mayor_coleccion():
	
	# creo nueva colección conteniendo los autores y la cantidad de canciones de cada uno en la colección
	
	canciones_por_autor = {}

	for i in canciones:

		autor = canciones[i]["autor"]

		if autor not in canciones_por_autor:
			canciones_por_autor[autor] = 1
		else:
			canciones_por_autor[autor] += 1

	# itero sobre la colección creada para obtener el autor que mas canciones tiene

	mas_repetido = None
	for k, v in canciones_por_autor.items():
		if mas_repetido == None:
			mas_repetido = k
			cantidad_de_canciones = v
		elif cantidad_de_canciones < v:
			cantidad_de_canciones = v
			mas_repetido = k


	print("El autor que más canciones tiene en la colección es:", mas_repetido.title(), "con", cantidad_de_canciones, "en total.")

# llamado a la función
mayor_coleccion()

print("____________________________________________________________\n")



#¿Cuántas horas de música tiene en total?

def hs_total():

	total = 0
	for i in canciones:
		total += canciones[i]["duracion"]

	# el total hasta aqui está expresado en segundos
	en_min = total / 60

	# transformando a formato hs y min
	if en_min > 60:
		hs = int(en_min // 60)
		min_final = int(en_min % 60)
		print("La colección tiene", str(hs) + ":" + str(min_final), "hs de música")
	else:
		print("La colección tiene", en_min, "minutos de música en total")

hs_total()
print("____________________________________________________________\n")
