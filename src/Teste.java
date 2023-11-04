import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Teste {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Passeio[] veiculosPasseio = new Passeio[5];
        Carga[] veiculosCarga = new Carga[5];
        int indicePasseio = 0;
        int indiceCarga = 0;
        int escolha = 0;
        System.out.println("==================================================");

        do {
            System.out.println("Sistema de Gestão de Veículos - Menu Inicial");
            System.out.println("1. Cadastrar Veiculo de Passeio");
            System.out.println("2. Cadastrar Veiculo de Carga");
            System.out.println("3. Imprimir Todos os Veiculos de Passeio");
            System.out.println("4. Imprimir Todos os Veiculos de Carga");
            System.out.println("5. Imprimir Veiculo de Passeio pela Placa");
            System.out.println("6. Imprimir Veiculo de Carga pela Placa");
            System.out.println("7. Sair do Sistema");
       System.out.println("==================================================");
      System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            int cadastrarNovamenteVeiculoCarga = 0;
            int cadastrarNovamenteVeiculoPasseio = 0;

            switch (escolha) {
                case 1:
                    do{
                        Passeio novoPasseio = new Passeio();

                        System.out.print("Digite a placa: ");
                        novoPasseio.setPlaca(Leitura.entDados());

                        System.out.print("Digite a marca: ");
                        novoPasseio.setMarca(Leitura.entDados());

                        System.out.print("Digite o modelo: ");
                        novoPasseio.setModelo(Leitura.entDados());

                        System.out.print("Digite a cor: ");
                        novoPasseio.setCor(Leitura.entDados());

                        System.out.print("Digite a velocidade máxima (Km/h): ");
                        float velocMaxPasseio = Float.parseFloat(Leitura.entDados());
                        novoPasseio.setVelocMax(velocMaxPasseio);

                        veiculosPasseio[indicePasseio] = novoPasseio;
                        indicePasseio++;
                        System.out.println("Veículo de passeio cadastrado com sucesso.");

                        System.out.println("Deseja cadastrar mais um veículo de Passeio?");
                        System.out.println("1 - SIM");
                        System.out.println("2 - NÃO");
                        cadastrarNovamenteVeiculoPasseio = scanner.nextInt();
                    }while(cadastrarNovamenteVeiculoPasseio == 1 && indicePasseio < veiculosPasseio.length);

                    break;
                case 2:
                        do {
                            Carga novoCarga = new Carga();

                            System.out.print("Digite a placa: ");
                            novoCarga.setPlaca(Leitura.entDados());

                            System.out.print("Digite a marca: ");
                            novoCarga.setMarca(Leitura.entDados());

                            System.out.print("Digite o modelo: ");
                            novoCarga.setModelo(Leitura.entDados());

                            System.out.print("Digite a cor: ");
                            novoCarga.setCor(Leitura.entDados());

                            System.out.print("Digite a carga máxima (em Kg): ");
                            int cargaMax = Integer.parseInt(Leitura.entDados());
                            novoCarga.setCargaMax(cargaMax);

                            System.out.print("Digite a tara (em Kg): ");
                            int tara = Integer.parseInt(Leitura.entDados());
                            novoCarga.setTara(tara);

                            System.out.print("Digite a velocidade máxima (em Km/h): ");
                            float velocMax = Float.parseFloat(Leitura.entDados());
                            novoCarga.setVelocMax(velocMax);


                            veiculosCarga[indiceCarga] = novoCarga;
                            indiceCarga++;
                            System.out.println("Veículo de carga cadastrado com sucesso.");

                            System.out.println("Deseja cadastrar mais um veículo de Carga?");
                            System.out.println("1 - SIM");
                            System.out.println("2 - NÃO");
                            cadastrarNovamenteVeiculoCarga = scanner.nextInt();
                        }while(cadastrarNovamenteVeiculoCarga == 1 && indiceCarga < veiculosCarga.length);

                    break;
                case 3:
                    System.out.println("Veículos de Passeio Cadastrados:");
                    for (Passeio passeio : veiculosPasseio) {
                        if (passeio != null) {
                            System.out.println("Placa: " + passeio.getPlaca());
                            System.out.println("Marca: " + passeio.getMarca());
                            System.out.println("Modelo: " + passeio.getModelo());
                            System.out.println("Cor: " + passeio.getCor());
                            System.out.println("Velocidade Máxima: " + passeio.calcVel(passeio.getVelocMax()) + " m/h");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Veículos de Carga Cadastrados:");
                    for (Carga carga : veiculosCarga) {
                        if (carga != null) {
                            System.out.println("Placa: " + carga.getPlaca());
                            System.out.println("Marca: " + carga.getMarca());
                            System.out.println("Modelo: " + carga.getModelo());
                            System.out.println("Cor: " + carga.getCor());
                            System.out.println("Carga Máxima: " + carga.getCargaMax() + " Kg");
                            System.out.println("Tara: " + carga.getTara() + " Kg");
                            System.out.println("Velocidade Máxima: " + carga.calcVel(carga.getVelocMax()) + " Cm/h");
                            System.out.println("");
                        }
                    }
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println("Digite a placa do veículo de passeio que deseja imprimir: ");
                    System.out.println("");
                    String placaPasseio = Leitura.entDados();
                    imprimirVeiculoPasseioPorPlaca(placaPasseio, veiculosPasseio);
                    break;
                case 6:
                    System.out.println("================================================== ");
                    System.out.print("Digite a placa do veículo de carga que deseja imprimir: ");
                    System.out.println("================================================== ");

                    String placaCarga = Leitura.entDados();
                    imprimirVeiculoCargaPorPlaca(placaCarga, veiculosCarga);
                    break;
                case 7:
                    System.out.println("-------------------------------------------------- ");
                    System.out.println("Saindo do sistema...");
                    TimeUnit.MILLISECONDS.sleep(1000); // Pausa por 1000 milessegundos
                    break;
                default:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Opção inválida.");
                    System.out.println("-------------------------------------------------- ");

            }
        } while (escolha != 7);
        scanner.close();
    }

    // Função para imprimir um veículo de passeio com base na placa
    public static void imprimirVeiculoPasseioPorPlaca(String placa, Passeio[] veiculosPasseio) {
        for (Passeio veiculo : veiculosPasseio) {
            if (veiculo != null && veiculo.getPlaca().equals(placa)) {
                System.out.println("Veículo de Passeio Encontrado:");
                System.out.println("Placa: " + veiculo.getPlaca());
                System.out.println("Marca: " + veiculo.getMarca());
                System.out.println("Modelo: " + veiculo.getModelo());
                System.out.println("Cor: " + veiculo.getCor());
                System.out.println("Velocidade Máxima: " + veiculo.calcVel(veiculo.getVelocMax()) + " m/h");
                return;
            }
        }
        System.out.println("Veículo de passeio com placa " + placa + " não encontrado.");
    }

    // Função para imprimir um veículo de carga com base na placa
    public static void imprimirVeiculoCargaPorPlaca(String placa, Carga[] veiculosCarga) {
        for (Carga veiculo : veiculosCarga) {
            if (veiculo != null && veiculo.getPlaca().equals(placa)) {
                System.out.println("Veículo de Carga Encontrado:");
                System.out.println("Placa: " + veiculo.getPlaca());
                System.out.println("Marca: " + veiculo.getMarca());
                System.out.println("Modelo: " + veiculo.getModelo());
                System.out.println("Cor: " + veiculo.getCor());
                System.out.println("Carga Máxima: " + veiculo.getCargaMax() + " Kg");
                System.out.println("Tara: " + veiculo.getTara() + " Kg");
                System.out.println("Velocidade Máxima: " + veiculo.calcVel(veiculo.getVelocMax()) + " cm/h");
                return;
            }
        }
        System.out.println("Veículo de carga com placa " + placa + " não encontrado.");
    }
}
