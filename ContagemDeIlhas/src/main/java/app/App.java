package app;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        //tamanho da matrix
        System.out.print("Entre com a qtd de linhas: ");
        int l = sc.nextInt();
        System.out.print("Entre com a qtd de colunas: ");
        int c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i=0; i<l; i++) {
            for (int j=0; j<c; j++) {
                System.out.print("Digite um valor para mat["+i+"]["+j+"]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        //imprime os valores
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        //1) Determinação se é uma ilha simples
        //Se linha -1, coluna -1 = 0 && linha -1, coluna 0 = 0 && linha -1, coluna +1 = 0
        //Se linha 0, coluna -1 = 0 && linha 0, coluna 0 = 1 && linha 0, coluna +1 = 0
        //Se linha +1, coluna -1 = 0 && linha +1, coluna 0 = 0 && linha +1, coluna +1 = 0

        //2)
        //Percorrer as linhas e colunas até achar um 1. Grave a posição i,j como inicial
        //Verificar se a próxima coluna é 1, se for, continue verificando até achar zero ou acabar a linha. Grave a posição i,j do último 1 como final.
        //Pule para a próxima linha e continue percorrendo.
        //Se não achar mais 1, o trecho entre a posição incial e final desta linha será computada como uma ilha.
        //Salvar essas posições num vetor decimal de ilhas [l.ci , l.cf]
        //Pule para a próxima linha.
        //Repita o passo 2)
        ....continuar


        //Contar quantas matrizes


        0 0 0 0
        0 0 1 0 (1.2)
        0 0 0 0
        0 0 0 0
        =1

        0 0 0 0
        0 1 1 1	(1.1, 1.3)
        0 0 0 0
        0 1 1 0	(3.1, 3.2)
        =2

        0 0 0 0
        0 1 1 1	(1.1, 1.3)
        0 0 1 0	(2.2)
        0 0 0 0
        =1

        0 0 0 0
        0 1 1 0	(1.1, 1.2)
        0 0 1 0	(2.2)
        0 0 1 0	(3.2)
        =1









    }
}
