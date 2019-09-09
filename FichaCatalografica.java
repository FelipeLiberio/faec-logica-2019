import java.util.Random;
import java.util.Scanner;

public class FichaCatalografica {
	
	
	int cod;
	boolean doado;
	String nObra;
	String nAutor;
	String ed = "Makron Books";
	int nPag;
	
	public static void main (String [] args){
		
		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		int busca = 0;
		int buscaArea = 0;
		
		FichaCatalografica bio [] = new FichaCatalografica [500];
		FichaCatalografica exa [] = new FichaCatalografica [500];
		FichaCatalografica hum [] = new FichaCatalografica [500];
		
		for (int i =0; i < 500; i++){			
			bio[i] = new FichaCatalografica();
			bio[i].cod = i;
			bio[i].doado = (i%2!=0)?true:false;
			bio[i].nObra = ("Livro Biomedicina "+i);
			bio[i].nAutor = ("Dr "+i);
			bio[i].ed = ("Editora Biomedicina "+i);
			bio[i].nPag = aleatorio.nextInt(500)+100;
			
			exa[i] = new FichaCatalografica();
			exa[i].cod = i+500;
			exa[i].doado = (i>250)?true:false;
			exa[i].nObra =  ("Livro Exatas "+i);
			exa[i].nAutor = ("Fulano "+i);
			exa[i].ed = ("Editora Exatas ");
			exa[i].nPag = aleatorio.nextInt(500)+100;
			
			hum[i] = new FichaCatalografica();
			hum[i].cod = i+1000;
			hum[i].doado = (i<250)?false:true;
			hum[i].nObra =  ("Livro Humanas "+i);
			hum[i].nAutor = ("Ciclano "+i);
			hum[i].ed = ("Editora Humanas");
			hum[i].nPag = aleatorio.nextInt(500)+100;	
		}

		System.out.println("--------------------------------------------------");
		System.out.println("|Digite a opcao desejada:                        |");
		System.out.println("| 1- Consulta livros                             |");
		System.out.println("| 2- Listar livros doados                        |");
		System.out.println("| 3- Listar livros comprados entre 100 e 300 pgs |");
		System.out.println("| 4- Alterar registro                            |");
		System.out.println("| 5- Excluir registro                            |");
		System.out.println("| 6- Sair                                        |");
		System.out.println("--------------------------------------------------");
		int op = teclado.nextInt();
		
		switch(op){
		case 1:
				while(busca != -1){ //2- consulta
			
					System.out.println("----------------------------------------");
					System.out.println(" Digite o codigo do livro:              ");
					busca = teclado.nextInt();
					if(busca == -1){
						break;
					}
					System.out.println("--------------------------");
					System.out.println("|Digite a area de busca: |");
					System.out.println("| 1-Ciencias Biomedicas  |");
					System.out.println("| 2-Ciencias Exatas      |");
					System.out.println("| 3-Ciencias Humanas     |");
					System.out.println("--------------------------");
					buscaArea = teclado.nextInt();
					System.out.println("----------------------------------------");
		
					for(int i = 0; i <500; i++){
						if(busca == -1){
							System.out.println("----------------------------------------");
							System.out.println("Livro nao cadastrado!");
							System.out.println("----------------------------------------");
							break;
						}
						else{
							if(busca == bio[i].cod && buscaArea == 1){
								System.out.println("----------------------------------------");
								System.out.println("Codigo de catalogacao: "+bio[i].cod);
								System.out.println("Doado: "+bio[i].doado);
								System.out.println("Nome da Obra: "+bio[i].nObra);
								System.out.println("Nome do Autor: "+bio[i].nAutor);
								System.out.println("Editora: "+bio[i].ed);
								System.out.println("N Pag.:  "+bio[i].nPag);
								System.out.println("----------------------------------------");
							}
							else{
								if(busca == exa[i].cod && buscaArea == 2){
									System.out.println("----------------------------------------");
									System.out.println("Codigo de catalogacao: "+exa[i].cod);
									System.out.println("Doado: "+exa[i].doado);
									System.out.println("Nome da Obra: "+exa[i].nObra);
									System.out.println("Nome do Autor: "+exa[i].nAutor);
									System.out.println("Editora: "+exa[i].ed);
									System.out.println("N Pag.: "+exa[i].nPag);
									System.out.println("----------------------------------------");
								}
								else{
									if(busca == hum[i].cod && buscaArea == 3){
										System.out.println("----------------------------------------");
										System.out.println("Codigo de catalogacao: "+hum[i].cod);
										System.out.println("Doado: "+hum[i].doado);
										System.out.println("Nome da Obra: "+hum[i].nObra);
										System.out.println("Nome do Autor: "+hum[i].nAutor);
										System.out.println("Editora: "+hum[i].ed);
										System.out.println("N Pag.:  "+hum[i].nPag);
										System.out.println("----------------------------------------");
									}
									
								}
							}
					
						}
					}
				}
			break;
		case 2://Listar livros doados
				System.out.println("Livros doados:");
				for(int i =0; i <500; i++){
					if (bio[i].doado == true){
						System.out.println("----------------------------------------");
						System.out.println("Codigo de catalogacao: "+bio[i].cod);
						System.out.println("Doado: "+bio[i].doado);
						System.out.println("Nome da Obra: "+bio[i].nObra);
						System.out.println("Nome do Autor: "+bio[i].nAutor);
						System.out.println("Editora: "+bio[i].ed);
						System.out.println("N Pag.:  "+bio[i].nPag);
						System.out.println("----------------------------------------");
					}
					else{
						if(exa[i].doado == true){
							System.out.println("----------------------------------------");
							System.out.println("Codigo de catalogacao: "+exa[i].cod);
							System.out.println("Doado: "+exa[i].doado);
							System.out.println("Nome da Obra: "+exa[i].nObra);
							System.out.println("Nome do Autor: "+exa[i].nAutor);
							System.out.println("Editora: "+exa[i].ed);
							System.out.println("N Pag.:  "+exa[i].nPag);
							System.out.println("----------------------------------------");
						}
						else{
							if(hum[i].doado == true){
								System.out.println("----------------------------------------");
								System.out.println("Codigo de catalogacao: "+hum[i].cod);
								System.out.println("Doado: "+hum[i].doado);
								System.out.println("Nome da Obra: "+hum[i].nObra);
								System.out.println("Nome do Autor: "+hum[i].nAutor);
								System.out.println("Editora: "+hum[i].ed);
								System.out.println("N Pag.:  "+hum[i].nPag);
								System.out.println("----------------------------------------");
							}
						}
					}	
				}
			break;
		case 3: //Listar doados entre 100 e 300 pgs
				System.out.println("Lista: ");
				for(int i =0; i <500; i++){
					if (bio[i].doado == false && bio[i].nPag >=100 && bio[i].nPag <=300 ){
						System.out.println("----------------------------------------");
						System.out.println("Codigo de catalogacao: "+bio[i].cod);
						System.out.println("Doado: "+bio[i].doado);
						System.out.println("Nome da Obra: "+bio[i].nObra);
						System.out.println("Nome do Autor: "+bio[i].nAutor);
						System.out.println("Editora: "+bio[i].ed);
						System.out.println("N Pag.:  "+bio[i].nPag);
						System.out.println("----------------------------------------");
					}
					else{
						if(exa[i].doado == false && exa[i].nPag >=100 && exa[i].nPag <=300 ){
							System.out.println("----------------------------------------");
							System.out.println("Codigo de catalogacao: "+exa[i].cod);
							System.out.println("Doado: "+exa[i].doado);
							System.out.println("Nome da Obra: "+exa[i].nObra);
							System.out.println("Nome do Autor: "+exa[i].nAutor);
							System.out.println("Editora: "+exa[i].ed);
							System.out.println("N Pag.:  "+exa[i].nPag);
							System.out.println("----------------------------------------");
						}
						else{
							if(hum[i].doado == false && hum[i].nPag >=100 && hum[i].nPag <=300 ){
								System.out.println("----------------------------------------");
								System.out.println("Codigo de catalogacao: "+hum[i].cod);
								System.out.println("Doado: "+hum[i].doado);
								System.out.println("Nome da Obra: "+hum[i].nObra);
								System.out.println("Nome do Autor: "+hum[i].nAutor);
								System.out.println("Editora: "+hum[i].ed);
								System.out.println("N Pag.:  "+hum[i].nPag);
								System.out.println("----------------------------------------");
							}
						}	
					
					}
				}
			break;
		case 4: //Alteração registro
				int codAlt, areaAlt;
				System.out.println("Digite o codigo do livro: ");
				codAlt = teclado.nextInt();
				System.out.println("Digite a area do livro: ");
				areaAlt = teclado.nextInt();
				for(int i =0; i <500; i++){
					if (codAlt == bio[i].cod && areaAlt == 1){
						System.out.println("----------------------------------------");
						System.out.println("Codigo de catalogacao: "+bio[i].cod);
						System.out.println("Doado: "+bio[i].doado);
						System.out.println("Nome da Obra: "+bio[i].nObra);
						System.out.println("Nome do Autor: "+bio[i].nAutor);
						System.out.println("Editora: "+bio[i].ed);
						System.out.println("N Pag.:  "+bio[i].nPag);
						System.out.println("----------------------------------------");
						System.out.println("Digite o as novas informacoes: ");
						System.out.print("Codigo de Catalogacao:");
						bio[i].cod = teclado.nextInt();
						System.out.print("Livro doado? 1-Sim/2-Nao ");
						int doadoAlt = teclado.nextInt();
						System.out.print("Nome da Obra: ");
						bio[i].nObra = scan.nextLine();
						System.out.print("Nome do Autor: ");
						bio[i].nAutor = scan.nextLine();
						System.out.print("Editora: ");
						bio[i].ed = scan.nextLine();
						System.out.print("N de paginas: ");
						bio[i].nPag = teclado.nextInt();
						switch(doadoAlt){
							case 1:
								bio[i].doado = true;
							case 2:
								bio[i].doado = false;
						}
					}
					else{
						if(codAlt == exa[i].cod && areaAlt == 2){
							System.out.println("----------------------------------------");
							System.out.println("Codigo de catalogacao: "+exa[i].cod);
							System.out.println("Doado: "+exa[i].doado);
							System.out.println("Nome da Obra: "+exa[i].nObra);
							System.out.println("Nome do Autor: "+exa[i].nAutor);
							System.out.println("Editora: "+exa[i].ed);
							System.out.println("N Pag.:  "+exa[i].nPag);
							System.out.println("----------------------------------------");
							System.out.println("Digite o as novas informacoes: ");
							System.out.print("Codigo de Catalogacao:");
							exa[i].cod = teclado.nextInt();
							System.out.print("Livro doado? 1-Sim/2-Nao");
							int doadoAlt = teclado.nextInt();
							System.out.print("Nome da Obra: ");
							exa[i].nObra = scan.nextLine();
							System.out.print("Nome do Autor: ");
							exa[i].nAutor = scan.nextLine();
							System.out.print("Editora: ");
							exa[i].ed = scan.nextLine();
							System.out.print("N de paginas: ");
							exa[i].nPag = teclado.nextInt();
							switch(doadoAlt){
								case 1:
									exa[i].doado = true;
								case 2:
									exa[i].doado = false;
								}
						}
						
						else{
							if(codAlt == hum[i].cod && areaAlt == 3){
								System.out.println("----------------------------------------");
								System.out.println("Codigo de catalogacao: "+hum[i].cod);
								System.out.println("Doado: "+hum[i].doado);
								System.out.println("Nome da Obra: "+hum[i].nObra);
								System.out.println("Nome do Autor: "+hum[i].nAutor);
								System.out.println("Editora: "+hum[i].ed);
								System.out.println("N Pag.:  "+hum[i].nPag);
								System.out.println("----------------------------------------");
								System.out.println("Digite o as novas informacoes: ");
								System.out.print("Codigo de Catalogacao:");
								hum[i].cod = teclado.nextInt();
								System.out.print("Livro doado? 1-Sim/2-Nao ");
								int doadoAlt = teclado.nextInt();
								System.out.print("Nome da Obra: ");
								hum[i].nObra = scan.nextLine();
								System.out.print("Nome do Autor: ");
								hum[i].nAutor = scan.nextLine();
								System.out.print("Editora: ");
								hum[i].ed = scan.nextLine();
								System.out.print("N de paginas: ");
								hum[i].nPag = teclado.nextInt();
								switch(doadoAlt){
									case 1:
										bio[i].doado = true;
									case 2:
										bio[i].doado = false;
								}
							}
						}
				}
			}
			break;
		case 5:
			System.out.println("Digite o codigo do livro a ser excluido: ");
			int liExc = teclado.nextInt();
			System.out.println("Digite a area do livro a ser excluido: ");
			int arExc = teclado.nextInt();
			
			for(int i =0; i <500; i++ ){
				if (liExc == bio[i].cod && arExc == 1){
					System.out.println("Excluir livro: "+ bio[i].nObra+" ?");
					String certeza = scan.nextLine();
					System.out.println("Certeza? ");
					String mesmo = scan.nextLine();
					System.out.println("Certeza mesmo? ");	
					String certezaMesmo = scan.nextLine();
					

						bio[i].cod = 0;
						bio[i].doado = false;
						bio[i].nObra = "VAZIO";
						bio[i].nAutor = "VAZIO";
						bio[i].ed = "VAZIO";
						bio[i].nPag = 0;
						System.out.println("Livro excluido!!");
				}
				else{
					if(liExc == hum[i].cod && arExc == 2){
						System.out.println("Excluir livro: "+ hum[i].nObra+" ?");
						String certeza = scan.nextLine();
						System.out.println("Certeza? ");
						String mesmo = scan.nextLine(); 
						hum[i].cod = 000;
						hum[i].doado = false;
						hum[i].nObra = "VAZIO";
						hum[i].nAutor = "VAZIO";
						hum[i].ed = "VAZIO";
						hum[i].nPag = 0;
						System.out.println("Livro excluido");
					
					}
					else{
						if(liExc == exa[i].cod && arExc == 3){
							System.out.println("Excluir livro: "+ exa[i].nObra+" ?");
							String certeza = scan.nextLine();
							System.out.println("Certeza? ");
							String mesmo = scan.nextLine(); 
							exa[i].cod = 000;
							exa[i].doado = false;
							exa[i].nObra = "VAZIO";
							exa[i].nAutor = "VAZIO";
							exa[i].ed = "VAZIO";
							exa[i].nPag = 0;
							System.out.println("Livro excluido");
						
						}
					}
				}
			}
		case 6:
			System.out.println("Ate a proxima!!");
			break;
		default:
			System.out.println("Tente outra opcao");
		}
	}
}