Produtor-Consumidor em Java
Implementação do padrão produtor-consumidor com threads em Java.

Estrutura
SharedList.java - Lista compartilhada com sincronização

Producer.java - Thread produtora

Consumer.java - Thread consumidora

Main.java - Classe principal para execução

Funcionalidade
Thread T1 produz valores inteiros

Thread T2 consome os valores

Sincronização com wait()/notifyAll()

Buffer limitado a 10 elementos

Como executar:
javac *.java
java Main
