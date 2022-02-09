package com.company;

public class MatrixGraph {

        int[][] matrixedgegraph;
        int [][] matrixweightgraph;

        MatrixGraph(int vertices){
            matrixedgegraph = new int[vertices][vertices];
            matrixweightgraph=new int [vertices][vertices];

        }
        public void addEdge(int from, int to, int weight){
            matrixedgegraph[from][to]=1;
            matrixweightgraph[from][to]=weight;
        }
        public void printGraphs(){
            for(int fromi =0; fromi< matrixedgegraph.length;fromi++){
                System.out.println("Edge from vertx"+fromi);
                for (int toj=0;toj< matrixedgegraph.length;toj++){
                    if(matrixedgegraph[fromi][toj]==1){
                        System.out.println(" to " +toj);
                        System.out.println(" weight "+ matrixweightgraph[fromi][toj]);
                    }
                }
                System.out.println(" ");
            }
        }



    }

