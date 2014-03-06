/*
  Iterator é um padrão para percorrer listas, conjuntos, mapas etc.
É o que você chamaria de "cursor" se estivesse escrevendo stored procedures em algum banco SQL. Portanto não é um conceito novo ou extraordinariamente difícil de manipular.
Se você sabe que o seu List é um ArrayList, então não há problemas em usar o índice em vez de usar um Iterator. Para todos os outros tipos (LinkedList, Set, Map etc.) você tem de usar o Iterator.
E de qualquer maneira você continua a usar o for:
  digamos que coleção seja uma coleção de BlaBleBli  
    for (Iterator it = colecao.iterator(); it.hasNext(); ) {  
         BlaBleBli obj = (BlaBleBli) it.next();  
    }  
 o Iterator permite que você remova um objeto enquanto está percorrento a lista.
Por exemplo:
    while (it.hasNext)  
    {  
       obj = it.next();  
       if (canExclude(obj))  
            it.remove();  
    }  
 */

