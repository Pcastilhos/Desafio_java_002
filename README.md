# Desafio_java_002
FONTE: https://br.spoj.com/problems/PALIMG14/
/n
Palíndromos

Um palíndromo é uma palavra que é lida da mesma maneira tanto da esquerda para a direita quanto da direita para a esquerda. Alguns exemplos de palíndromos são: arara, rodador e Mussum.

Dada uma palavra qualquer p, qual é o número mínimo de caracteres que precisam ser adicionados ao fim da palavra para que ela se torne um palíndromo?

Entrada
A entrada possui múltiplos casos de teste. Cada caso de teste é dado em uma linha, que contém uma única palavra p, composta apenas por letras minúsculas sem acento (a -- z). Essa palavra possui no máximo 128 caracteres.

A entrada termina com o fim do arquivo.

Saída
Para cada caso de teste, imprima uma linha contendo um único inteiro N, que é o menor número de caracteres que precisam ser adicionados ao fim da palavra para torná-la um palíndromo.

Exemplos
Entrada:
arara
mussum
maratona
anili
abcdef
arar

Saída:
0
0
7
2
5
1
Arara e Mussum já são palíndromos. O menor palíndromo que começa com "maratona" é "maratonanotaram", que possui sete caracteres a mais. Para "anili", porém, basta adicionar dois caracteres e formar "anilina".

