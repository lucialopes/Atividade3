/*
  Iterator � um padr�o para percorrer listas, conjuntos, mapas etc.
� o que voc� chamaria de "cursor" se estivesse escrevendo stored procedures em algum banco SQL. Portanto n�o � um conceito novo ou extraordinariamente dif�cil de manipular.
Se voc� sabe que o seu List � um ArrayList, ent�o n�o h� problemas em usar o �ndice em vez de usar um Iterator. Para todos os outros tipos (LinkedList, Set, Map etc.) voc� tem de usar o Iterator.
E de qualquer maneira voc� continua a usar o for:
  digamos que cole��o seja uma cole��o de BlaBleBli  
    for (Iterator it = colecao.iterator(); it.hasNext(); ) {  
         BlaBleBli obj = (BlaBleBli) it.next();  
    }  
 o Iterator permite que voc� remova um objeto enquanto est� percorrento a lista.
Por exemplo:
    while (it.hasNext)  
    {  
       obj = it.next();  
       if (canExclude(obj))  
            it.remove();  
    }  
 */

