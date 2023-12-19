package analizador2;
import static analizador2.MyTokens.*;

%%
%class Lexico
%type MyTokens
L=[a-zA-Z_]+
D = [0-9]+
F = [0-9]{1,2}

espacio = [ \t\r\n]+
%{
    public String lexeme;
%}

%%

/* espacios */
{espacio} {/*Ignore*/}

/* Comillas */
( "\"" ) {return Comillas;}

/* reservadas*/
(import) {lexeme = yytext(); return Import;}

(class) {lexeme = yytext(); return Clase;}

(void) {lexeme = yytext(); return MetodoVacio;}

(return) {lexeme = yytext(); return MetodoRetorno;}

(retorn) {lexeme = yytext(); return Retorno;}


/* tipos de datos*/
(int) {return Int;}

(dex) {return Decimal;}

(bool) {return Booleano;}

(char) {return Caracter;}

(String) {return Cadena;}

/* palabras */

(grant) {return Asigna;}

(if) {return If;}

(else) {return Else;}

/* simbolos*/
"+" {return Suma;}

"-" {return Resta;}

"\*" {return Multiplicacion;}

"/" {return Division;}

"%" {return Residuo;}

"(" {return ParentesisApertura;}

")" {return ParentesisCierre;}

"{" {return LlaveApertura;}

"}" {return LlaveCierre;}


("=" | "<" | ">" | "<=" | ">=" | "!=") {return Relacional;}

"&&" {return AND;}

"||" {return OR;}

"!" {return NOT;}

";" {return Fin;}

"@" {return Arroba;}

"," {return Coma;}

"." {return Punto;}

(vdd|falso) {return TrueFalse;}

/* valores */
{L}({L}|{D})* {lexeme = yytext(); return Identificador;}

("(-"{D}+")")|{D}+ {lexeme = yytext(); return Numero;}

("(-"{D}+"."{D}{1,2}")")|({D}+"."{F}) {lexeme = yytext(); return NumeroDecimal;}

("\""{L}*({espacio}*{L}*)*"\"") {lexeme = yytext(); return Texto;}

 . {return ERROR;}





