%{
#include <stdio.h>
%}

%%
[0123456789]+           printf("NUMBER\n");
[a-zA-Z"_"][a-zA-Z0-9"_"]*    printf("WORD\n");
%%