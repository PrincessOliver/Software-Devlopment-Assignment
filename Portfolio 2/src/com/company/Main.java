package com.company;

public class Main {

    public static void main(String[] args) {
        MatrixGraph thisGraph =new MatrixGraph(7);
        thisGraph.addEdge(0,1,1);
        thisGraph.addEdge(0,2,5);
        thisGraph.addEdge(0,4,3);
        thisGraph.addEdge(1,4,1);
        thisGraph.addEdge(1,4,1);
        thisGraph.addEdge(1,5,7);
        thisGraph.addEdge(2,3,1);
        thisGraph.addEdge(3,4,1);
        thisGraph.addEdge(3,6,1);
        thisGraph.addEdge(4,2,1);
        thisGraph.addEdge(4,3,3);
        thisGraph.addEdge(4,5,3);
        thisGraph.addEdge(4,6,4);
        thisGraph.addEdge(5,6,1);
       // thisGraph.printGraphs();

        /*
        Eskildrup = A
        Haslev = B
        Holbæk = C
        Jægerspris = D
        Kalundborg = E
        Korsør = F
        Køge = G
        Maribo =H
        Næstved = I
        Ringsted = J
        Slagelse = K
        NyKøbing Falster = L
        Sorø = M
        VordingBorg = N
        Roskilde = O
        Nakskov = P

         */

        AdjacencyListGraph adjGraph =new AdjacencyListGraph();
        Vertex A=new Vertex("Eskildrup: ");
        adjGraph.addVertex(A);
        Vertex B = new Vertex("Haslev: ");
        adjGraph.addVertex(B);
        Vertex C = new Vertex("Holbæk: ");
        adjGraph.addVertex(C);
        Vertex D = new Vertex("Jægerspris: ");
        adjGraph.addVertex(D);
        Vertex E = new Vertex("Kalundborg: ");
        adjGraph.addVertex(E);
        Vertex F = new Vertex("Korsør: ");
        adjGraph.addVertex(F);
        Vertex G = new Vertex("Køge: ");
        adjGraph.addVertex(G);
        Vertex H = new Vertex("Maribo: ");
        adjGraph.addVertex(H);
        Vertex I= new Vertex("Næstved: ");
        adjGraph.addVertex(I);
        Vertex J = new Vertex("Ringsted: ");
        adjGraph.addVertex(J);
        Vertex K = new Vertex("Slagelse: ");
        adjGraph.addVertex(K);
        Vertex L = new Vertex("NyKøbingFalster: ");
        adjGraph.addVertex(L);
        Vertex M = new Vertex("Sorø: ");
        adjGraph.addVertex(M);
        Vertex N = new Vertex("vordingborg: ");
        adjGraph.addVertex(N);
        Vertex O = new Vertex("Roskilde: ");
        adjGraph.addVertex(O);
        Vertex P = new Vertex("Nakskov: ");
        adjGraph.addVertex(P);

        adjGraph.newEdge(A,H,28);
        adjGraph.newEdge(A,L,13);
        adjGraph.newEdge(A,N,25);
        adjGraph.newEdge(B,F,60);
        adjGraph.newEdge(B,G,24);
        adjGraph.newEdge(B,I,25);
        adjGraph.newEdge(B,J,19);
        adjGraph.newEdge(B,O,47);
        adjGraph.newEdge(B,K,48);
        adjGraph.newEdge(B,M,34);
        adjGraph.newEdge(B,N,40);
        adjGraph.newEdge(C,D,34);
        adjGraph.newEdge(C,E,44);
        adjGraph.newEdge(C,F,66);
        adjGraph.newEdge(C,J,36);
        adjGraph.newEdge(C,O,32);
        adjGraph.newEdge(C,K,46);
        adjGraph.newEdge(C,M,34);
        adjGraph.newEdge(D,F,94);
        adjGraph.newEdge(D,G,58);
        adjGraph.newEdge(D,J,56);
        adjGraph.newEdge(D,O,33);
        adjGraph.newEdge(D,K,74);
        adjGraph.newEdge(D,M,63);
        adjGraph.newEdge(E,J,62);
        adjGraph.newEdge(E,O,70);
        adjGraph.newEdge(E,K,39);
        adjGraph.newEdge(E,M,51);
        adjGraph.newEdge(F,I,45);
        adjGraph.newEdge(F,K,20);
        adjGraph.newEdge(G,I,45);
        adjGraph.newEdge(G,J,28);
        adjGraph.newEdge(G,O,25);
        adjGraph.newEdge(G,N,60);
        adjGraph.newEdge(H,P,27);
        adjGraph.newEdge(H,L,26);
        adjGraph.newEdge(I,O,57);
        adjGraph.newEdge(I,J,26);
        adjGraph.newEdge(I,K,37);
        adjGraph.newEdge(I,M,32);
        adjGraph.newEdge(I,N,28);
        adjGraph.newEdge(J,O,31);
        adjGraph.newEdge(J,M,15);
        adjGraph.newEdge(J,N,58);
        adjGraph.newEdge(K,M,14);





        adjGraph.printAdjecencyGraph();


    }

}
