package SupermercadoEnJava;



	//author @SergiioogGarcia

		import java.util.ArrayList;
		import java.util.Scanner;
		import java.util.TreeSet;

		public class SupermercadoMain {
			
			static Scanner entrada = new Scanner(System.in);        				//Scanner estático para que sirva para todas las funciones del código.          
			
			static ArrayList <String> carro = new ArrayList <>();					//ArrayList "carro" para guardar la seleccion del usuario.
			
			static ArrayList <String> supermercado = new ArrayList <>();			//ArrayList "supermercado" que contiene todos los productos del propio supermercado.
			
			final static String green="\033[32m"; 									//Paleta de colores para colorear las sentencias.
			
			final static String red="\033[31m"; 
			
			final static String yellow="\033[33m"; 									//Color amarillo para los sysos
			
			final static String blue="\033[34m"; 
			
			final static String purple="\033[35m"; 
			
			final static String cyan="\033[36m"; 
			
			final static String reset= "\u001B[0m";									//Reset que es necesario para que todo el texto vuelva a tener el mismo color después de haber sido coloreado de uno en específico previamente.
			
			public static void main(String[] args) {
				
				supermercado.add("Tomate");											//Añadimos los productos al supermercado con .add + nombre del producto.
				
				supermercado.add("Aceite");
				
				supermercado.add("Pan");
				
				supermercado.add("Leche");
				
				supermercado.add("Yogourt");
				
				supermercado.add("Queso");
				
				supermercado.add("Jamón");
				
				supermercado.add("Harina");
				
				supermercado.add("Champú");
				
				supermercado.add("Carne");
				
				supermercado.add("Pescado");
				
				supermercado.add("Pizza");
				
				supermercado.add("Actimel");
				
				supermercado.add("Pepito");
				
				supermercado.add("Pastelitos");
				
				supermercado.add("Vino");
				
				supermercado.add("Agua");
				
				supermercado.add("Cerveza");
				
				supermercado.add("Zumo");
				
				supermercado.add("Coca-Cola");
				
				
				menuPrincipal();
				
			}
				public static void menuPrincipal() {
					
					System.out.println(yellow + "Introduce tu elección en el siguiente menú: " + reset);
					
					System.out.println("**********MENÚ**********" );												    //Menú principal para que el usuario escoja dependiendo de si es trabajador o cliente.
					System.out.println("1.Personal de supermercado");
					System.out.println("2.Cliente");
					
					int eleccionTrabajador = entrada.nextInt();
							
						   switch (eleccionTrabajador){									 								//Switch para dar una serie de casos posibles en función de lo que el usuario escoja.
				           
						   case 1:{
				            	
				            	String clave = "J4v4d0n4";																//Contraseña a acertar de tipo String.
				            	
				            	System.out.println(yellow + "Introduzca su clave: " + reset);							//El color + reset da color al tramo comprendido entre ellos. El reset se utiliza para resetear el color del programa a partir de él ya que dicho color se queda "grabado" a lo largo de este.
				            	
				            	for (int i = 1; i <= 3; i++) {
				            																							
				            		String respuestaUsuario = entrada.next();
																																
				            		if(respuestaUsuario.equals(clave)) {												/*Se hace un bucle que pregunte hasta 3 veces la contraseña. Si la respuesta del Usuario es igual a la clave, entonces es correcta y da lugar
				            		 																					  al menú específico para trabajadores. Si llega al intento 3, le digo que vuelva a empezar ( se acaba el programa ), mientras que para el resto
				            		 																					  de casos, quiero que me imprima que la contraseña no es correcta.*/
				            			System.out.println(green + "La clave introducida es correcta." + reset);
				            			
				            			MenuTrabajador();
				            		
				            		} else if( i == 3) {
				            			
				            			System.err.println("Contraseña incorrecta, vuelva a empezar.");
				            			
				            			menuPrincipal();
				            		}
				            		
				            		else
				            			
				            			System.err.println("Contraseña incorrecta, vuelve a introducirla.");
								}
				                
				            	break; 																					//Break, para que el programa finalice al acabar la opción.
				            }
				            case 2:{
				                
				            	Menu();																					//Si selecciona la opcion 2 le redirige al menú del Usuario (no necesita clave).
				                
				                break;
				            }
				            
				            default: 
				                
				            	System.err.println("La opción es incorrecta, por favor, escoja de entre las opciones disponibles");  //Si el usuario selecciona un número que no sea ni 1 ni 2, le saldrá lo siguiente y se le redirigirá al menú principal.
				               
				                menuPrincipal();
						   
						   }
				
				
			}
			
//			----------------------------------------------------------------------OPCIÓN TRABAJADOR----------------------------------------------------------------------------------------------------

			
			public static void MenuTrabajador() {																//Método del menú del Trabajador.
				
				System.out.println(yellow + "Introduce tu elección en el siguiente menú: " + reset);
				
				System.out.println("**********MENÚ**********");
				
				System.out.println("1.Mostrar productos del Supermercado");
				
				System.out.println("2.Añadir productos");
				
				System.out.println("3.Eliminar productos");
				
				System.out.println("4.Modificar productos");
				
				System.out.println("5.Salir" );
				
				int eleccionUsuario = entrada.nextInt();
				 
				switch (eleccionUsuario){
		         
				 case 1:{
		         	
		        	 System.out.println(yellow + "Ha seleccionado la opción 1" + reset);							/*Diferentes opciones que según lo que escoja el Usuario que redirigirán a los métodos específicamente
		         																								  creados para realizar lo que describen. Además se le añade un link al menú del Trabajador al acabar en
		         																								  la sección que esté el Usuario.*/
		         																									
		             opcionMostrarProductos();
		             
		             MenuTrabajador();
		             
		             break;
		         }
		         case 2:{
		             
		        	 System.out.println(yellow + "Ha seleccionado la opción 2" + reset);
		            
		             opcionAñadirProductos();
		             
		             MenuTrabajador();
		             
		             break;
		         }
		         case 3:{
		             
		        	 System.out.println(yellow + "Ha seleccionado la opción 3" + reset);
		             
		             opcionEliminarProductos();
		             
		             MenuTrabajador();
		             
		             break;
		         }
		         case 4:{
		             
		        	 System.out.println(yellow + "Ha seleccionado la opción 4" + reset);
		             
		             opcionModificarProducto();
		             
		             MenuTrabajador();
		             
		             break;
		         }
		         case 5:{
		         	
		        	opcionSalirTrabajador();
		         	
		         	main(null);																					//Se le referencia al main (lugar dónde está el menú principal) ya que es la opción de "salir".
		             
		         	break;
		         }
		         default: 
		             
		        	 System.err.println("La opción es incorrecta, por favor, escoja de entre las opciones disponibles");
		             
		             MenuTrabajador();
		         
				 }
			}
			public static void opcionMostrarProductos () {														//Método de mostrar productos.
				
				TreeSet <String> alfabeticamente = new TreeSet <String> (supermercado);      					/*Se realiza un TreeSet en el que guardamos el contenido del supermercado para que salga ordenado alfabéticamente
																												  (una de sus principales caracerísticas). */
				System.out.println(alfabeticamente);
			}
			
			public static void opcionAñadirProductos () {														//Método para añadir productos.
				
				System.out.println(yellow + "Introduce el número de alimentos que desea añadir: " + reset); 	//Se le pida al Usuario que añada un máximo de alimentos a añadir.
				
				int numeroAlimentos = entrada.nextInt();
				
				
				if(numeroAlimentos <= 0 ) {																		/*1ª Restricción (se verán mas restricciones iguales a lo largo del código): Si el número introducido es menor que 0
																												que se diga que no es válido (ya que no se puede añadir -1 alimento).*/
					System.err.println("El número introducido no es válido");
					
				} else {
					
					 System.out.println(yellow + "Estos son los alimentos actuales del supermercado: " + reset + supermercado);		//Para el resto de casos, que me haga el siguiente código
					 
					 for (int i = 1; i <= numeroAlimentos; i++) {																	//Desde 1 hasta el número del Usuario que se repita lo siguiente.
							
							System.out.println(yellow + "Introduce el alimento " + i + reset);										//Se le pide al Usuario que introduzca un alimento.
							
							String alimentoUsuario = entrada.next();
							
							if (!supermercado.contains(alimentoUsuario)) {													/*2ª Restricción: Si el supermercado no contiene el alimento del Usuario,
																															  que se añada y que salga la lista del supermerc. con el alimento añadido.	*/
									
								supermercado.add(alimentoUsuario);
								
								System.out.println(yellow + "El producto se ha añadido correctamente" + reset);
								
								System.out.println(supermercado);
							} 
						else {																							//3ª Restricción: Para el resto de casos que escriba lo siguiente (ya que en este ejer. se entiende que no se añaden alimentos que ya estén dentro del supermercado).
								
								System.err.println("El supermercado ya tiene el producto");								//Con system.err lo que hacemos es que el texto que se le añada, se muestre en rojo (ya que va dirigido a mostrar errores/fallos).
								
								i--;
								
							}
						
					  }
				}
				 
			}
			public static void opcionEliminarProductos () {																//Método para eliminar productos.
				
				System.out.println(yellow + "¿Cuántos productos va a eliminar? : " + reset);							
				
				int alimentos = entrada.nextInt();
				
				if(alimentos<0 || alimentos > supermercado.size()) {	
																														/*Si el num de alimentos a eliminar es menor a 0 o mayor del numero de alimentos del super
																														 que diga que el número no es válido (ya que no se pueden eliminar -1 alimento ni 50 alimentos cuándo
																														 hay un máximo de 30 (ej).*/
					System.err.println("Número seleccionado no válido");				
					
				} else {
					
					for (int i = 0; i < alimentos; i++) {
							
							System.out.println(yellow +"¿Qué producto quieres eliminar? : ");
							
							System.out.println("Este es el stock actual de alimentos: " + reset + supermercado);		//Se enseña el stock de alimentos.
							
							String productosEliminados = entrada.next();
							
							if(supermercado.contains(productosEliminados)) {											//Si el supermercado contiene el producto a eliminar, que lo elimine y para el resto de casos ( que no esté en la lista ), que diga la sentencia.
								
								supermercado.remove(productosEliminados);
								
								System.out.println(yellow + "Supermercado actual: " + reset + supermercado);
							
							} else
								
								System.err.println("No se puede eliminar, ya que no está en la lista");
							
							}
					}
				
				}
				
				
			
			public static void opcionModificarProducto () {																//Método para modificar productos.
				
					System.out.println(yellow + "¿Cuántos elementos quieres cambiar? " + reset);						//Se pregunta al usuario cuántos productos se quieren cambiar.
					
					int elementosCambiar = entrada.nextInt();
					
					if(elementosCambiar<0 || elementosCambiar > supermercado.size()) {											/*Si el num de alimentos a cambiar es menor a 0 o mayor del numero de alimentos del super
																														 que diga que el número no es válido (ya que no se pueden cambiar -1 alimento ni 50 alimentos cuándo
																														 hay un máximo de 30 (ej). Se podrían cambiar alimentos que ya han sido cambiados hasta llegar al máximo, pero en este
																														 ejercicio no se contemplaba dicha acción*/
						System.err.println("Número seleccionado no válido");
						
					} else {
						 	
								
							  for (int i = 0; i < elementosCambiar; i++) {													/*Se hace un bucle desde 0 hasta el num de alimentos que se quieran cambiar, para que pregunte el alimento que se va a cambiar 
							 																							 junto con su en dicho momento.*/ 
								
							  System.out.println(yellow + "¿Que elemento quieres cambiar? " + reset + supermercado);		//Se pregunta que elemento se quiere cambiar.
							  
							  String elemento = entrada.next();
								
							  if(supermercado.contains(elemento)) {
								  
								  System.out.println(yellow + "¿Qué elemento quieres añadir? " + reset );							/*Cómo buscamos un elemento dentro del supermercado, primero hay que diferenciar si está o no en el supermercado. Si el supermercado
								   																									  no lo contiene que escriba un error , mientras que si si que está, que pregunte qué elemento quiere añadir (porque no se puede buscar
								   																									  un alimento que no está en el supermercado). Dentro de esta condición surge otra condición la cuál si el supermercado ya cuenta con 
								   																									  el producto a añadir que diga que ya lo tiene (ya que en este caso, el producto tiene que ser único (no se pueden repetir varios Panes por ejemplo)) 
								   																									  y que vuelva uno atrás para que se repita la pregunta. 
								   																									  Si el supermercado no contiene el alimento a añadir que se añada con el set, el cuál al mismo tiempo elimina el alimento que buscamos 
								   																									  cambiar.
								   																									  */
							      String elementoAñadir = entrada.next();
							     
							      if (supermercado.contains(elementoAñadir)) {
							    	 
							    	  System.err.println("El elemento ya se encuentra en el Supermercado.");
							    	  
							    	  i--;
							      
							      }else {
							    	  
							    	  supermercado.set(i, elementoAñadir);
				        			  
							    	  System.out.println(yellow + "Su cambio se ha efectuado con éxito: " + reset + supermercado);
							      }
							     
							  }
							  
							  else {
								  
								  System.err.println("El elemento no se encuentra en el Supermercado.");
								  
								  i--;
							  }
								
							  } 		
							  
					}
					
				}
			
			public static void opcionSalirTrabajador () {																		//Este método lo único que hace es redirigir al menú principal.
				
				System.out.println(yellow + "¡Gracias por usar nuestra página! Redirigiendo al menú..." + reset);
			}	

			
			
//			--------------------------------------------------------------------------OPCIÓN CLIENTE----------------------------------------------------------------------------------------------------
			
			
			 
			public static void Menu () {  //Método del menú del cliente
				
				System.out.println(yellow + "Introduce tu elección en el siguiente menú: " + reset);
						
				System.out.println("**********MENÚ**********");
				
				System.out.println("1.Añadir productos del supermercado");
				
				System.out.println("2.Añadir productos al carrito");
				
				System.out.println("3.Mostrar carrito de la compra ordenado");
				
				System.out.println("4.Consultar producto del carrito");
				
				System.out.println("5.Cambiar un producto por otro");
				
				System.out.println("6.Salir");
				
				int eleccion = entrada.nextInt();
					
					   switch (eleccion){
			            
					   case 1:{
			            	
			            	System.out.println(yellow + "Ha seleccionado la opción 1" + reset);
			                
			            	opcionProductosSupermercado();
			                
			                Menu();
			                
			                break;
			            }
			            case 2:{
			                
			            	System.out.println(yellow + "Ha seleccionado la opción 2" + reset);
			                
			                opcionProductosCarrito();
			                
			                Menu();
			                
			                break;
			            }
			            case 3:{
			                
			            	System.out.println(yellow + "Ha seleccionado la opción 3" + reset);
			                
			                opcionCarritoOrdenado();
			               
			                Menu();
			                
			                break;
			            }
			            case 4:{
			                
			            	System.out.println(yellow + "Ha seleccionado la opción 4" + reset);
			                
			                opcionProductoConsulta();
			                
			                Menu();
			                
			                break;
			            }
			            case 5:{
			                
			            	System.out.println(yellow + "Ha seleccionado la opción 5" + reset);
			                
			                opcionCambioDeProducto();
			                
			                Menu();
			                
			                break;
			            }
			            case 6:{
			            	
			            	salir();
			            	
			            	Menu();
			               
			            	break;
			            }
			           
			            default: 
			               
			            	System.err.println("La opción es incorrecta, por favor, escoja de entre las opciones disponibles");
			                
			                Menu();
			            
					   

					   }
				}
			

			public static void opcionProductosSupermercado () {										//Método para ver los productos del supermercado.
																									//Mismo contenido que su función homóloga.
				TreeSet <String> alfabeticamente = new TreeSet <String> (supermercado);
				
				System.out.println(alfabeticamente);
				
			}
			
			public static void opcionProductosCarrito () {
				
				
				System.out.println(yellow + "Introduce el número de alimentos que desea: " + reset); 
				
				int numeroAlimentos = entrada.nextInt();
				
				if(numeroAlimentos < 0) {
					
					System.err.println("Cantidad de productos no válida");
				
				}else {
					
					for (int i = 1; i <= numeroAlimentos; i++) {										//Que se repita el bucle desde 1 hata el numero de Alimentos del Usuario. 
						
						System.out.println(yellow + "Introduce el alimento " + i + reset);
						
						String alimentoUsuario = entrada.next();
						
						//¿COMO SE PUEDE PONER QUE SI EL USUARIO PONE ALGO DIFERENTE A UN STRING HAGA ALGO?
						// IF (!ALIMENTOUSUARIO.EQUALS(STRING){} ??
						
							if (supermercado.contains(alimentoUsuario)&& !carro.contains(alimentoUsuario)) {    /*Si el supermerc. contiene el alimento y el carro no contiene el alimento, que se añada al carro.*/
									
								    carro.add(alimentoUsuario);
									
									System.out.println(carro);
							} 
							
							else {
								
								System.err.println("El producto no esta disponible");							//Para el resto de casos, no está disponible.
							   
								i--;
							}
						}
				  
				  }
				  		
				  }
			
				
					
					
				public static void opcionCarritoOrdenado  () {													//Método ordenar carrito.
					
					if (carro.isEmpty()) {																		/*Si el carrito está vacío, que rediriga a la opcion de salir al menú (para darle a la opción 2 y añadir algo al carrito
					 																							pero si está lleno (lo contrario) lo metemos en un TreeSet para ordenarlo alfabéticamente.*/
						System.err.println("El carrito está vacío");								
						
						Menu();
					} 
					
					else {
				
				TreeSet <String> alfabeticamente = new TreeSet <String>(carro);
				
				System.out.println(yellow + "Su lista ordenada alfabéticamente sería: " + reset + alfabeticamente);
					}
			}
				
				
				
			
				public static void opcionProductoConsulta () {	                                              //Método consultar producto.
					
					if (carro.isEmpty()) {																	/*Si el carrito está vacío que redirija al menú del usuario (ya que si no hay alimentos en el carrito no
																											  se puede hacer nada.*/
						System.err.println("El carrito está vacío");
						
						Menu();
					} 
					
					else {
		    	
				System.out.println(yellow + "¿Cuántos alimentos vas a buscar?: " + reset);					//Se pregunta el límite de alimentos para establecer el máximo del bucle.
		    	
		    	int busqueda = entrada.nextInt();
		    	
		    	
		    		
		    		if(busqueda > carro.size()) {																									/*Si el número de la busqueda es mayor que la long del carrito que imprima lo siguiente (ya que no se puede
		    		 																																  buscar 5 alimentos, cuándo se han seleccionado 2.*/
		    			System.err.println("El número de busquedas que quiere realizar es mayor que el número de alimentos del carrito");
		    		
		    		} else if (busqueda<0){																											//Si se busca -1 alimnento (ej) que diga que el número de búsquedas es menor a 0, ya que no se puede hacer una
		    																																		//búsqueda en negativo.
		    			System.err.println("El número de busquedas que quiere realizar es menor a 0");
		    		
		    		} else {
		    			
		    			for (int i = 0; i < busqueda; i++) {
		    				
		    				System.out.println(yellow + "¿Qué quieres buscar?: " + reset);
		            		
		    				String busquedaUsuario = entrada.next();
		            
		            		if(carro.contains(busquedaUsuario)) {																					//Si el carrito contiene lo que busca el Usuario que diga que lo contiene, pero si no lo tiene que diga que no lo contiene.
		                	
		            			System.out.println(yellow + "Su carrito contiene "+ reset + busquedaUsuario);
		                	
		            		} else if (!carro.contains(busquedaUsuario))
		                	
		            			System.err.println("Su búsqueda no está en el carrito de la compra");
		            			
		            	}
		    		}
					
					}
				    		
		        	}
			
					
				public static void opcionCambioDeProducto () {								//Método para cambiar de producto.
				
				if (carro.isEmpty()) {														//Si el carro está vacío que redirija al menú, mientras que si no lo está que siga en el método.
					
					System.err.println("El carrito está vacío");
					
					Menu();
				} 
				
				else {
					
				
				System.out.println(yellow + "¿Cuántos elementos quieres cambiar? " + reset);       //Se le pide al Usuario cuántos elementos va a añadir, para establecer el máximo de veces que se repita el bucle for.
				
				int elementosCambiar = entrada.nextInt();
				
				if(elementosCambiar > carro.size()) {
					
					System.err.println("El número de busquedas que quiere realizar es mayor que el número de alimentos del carrito");	//Si el num de búsquedas es mayor que el tamaño del carro que diga la sentencia y que redirija al menú.
					
					Menu();
					
				} else if (elementosCambiar<0){
					
					System.err.println("El número de busquedas que quiere realizar es menor a 0");	
																															// Si las búsquedas son menores a 0 que diga lo siguiente ya que no se pueden hacer búsquedas negativas.
					Menu();
					
				}else {

					  for (int i = 0; i < elementosCambiar; i++) {															
							
						  System.out.println(yellow + "¿Que elemento quieres cambiar? " + reset);						//Para el resto de casos, que vaya preguntando el elemento que se va a cambiar.
						  
						  String elemento = entrada.next();
							
							if(carro.contains(elemento)) {																
							
									
					        		System.out.println(yellow + "¿Qué elemento quieres añadir? " + reset);			/*Si el carro contiene el elemento, que se muestre cual se quiere añadir y con el set lo cambiamos uno por otro.*/
					        		
					        		String elementoAñadir = entrada.next();	
								
					        		if (supermercado.contains(elementoAñadir)) {    
					        				
					        				carro.set(i, elementoAñadir);
					        				
					        				System.out.println(yellow + "Su cambio se ha efectuado con éxito: " + reset + carro);
										  			
					        		} else if (!supermercado.contains(elementoAñadir)){
					        																																				//Si el supermercado no contiene el elemento a añadir o el carro no lo contiene que se muestren los siguientes errores.
					        			System.err.println("El producto que intenta añadir no se encuentra disponible en el supermercado, vuelva a realizarlo.");
					        			
					        			Menu();
					        			
					        		} 
								} else
									
									System.err.println("El carro no contiene el producto que desea cambiar. ");
									
									
							}
						}
				
				
					}  		
				
				}
				
				public static void salir() {																					//Método para salir.
					
					System.out.println(yellow + "¡Gracias por usar nuestra página! Redirigiendo al menú..." + reset);
					
					menuPrincipal();
				
					}

}
