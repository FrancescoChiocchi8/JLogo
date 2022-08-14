grammar Commands;

@header {
package it.unicam.cs.pa.pa2122.jlogo105504.api.gen;
}

sequenceInstruction: instruction* ;

instruction: forward
    | backward
    | left
    | right
    | clearScreen
    | home
    | penUp
    | penDown
    | setPenColor
    | setFillColor
    | setScreenColor
    | setPenSize
    | repeat;

forward: FORWARD NUMBER;

backward: BACKWARD NUMBER;

left: LEFT NUMBER;

right: RIGHT NUMBER;

clearScreen: CLEARSCREEN;

home: HOME;

penUp: PENUP;

penDown: PENDOWN;

setPenColor: SETPENCOLOR NUMBER NUMBER NUMBER;

setFillColor: SETFILLCOLOR NUMBER NUMBER NUMBER;

setScreenColor: SETSCREENCOLOR NUMBER NUMBER NUMBER;

setPenSize: SETPENSIZE NUMBER;

repeat: REPEAT NUMBER sequenceInstruction;

FORWARD: 'FORWARD ';
NUMBER: [0-9]+;
BACKWARD: 'BACKWARD ';
LEFT: 'LEFT ';
RIGHT: 'RIGHT ';
CLEARSCREEN: 'CLEARSCREEN ';
HOME: 'HOME';
PENUP: 'PENUP';
PENDOWN: 'PENDOWN';
SETPENCOLOR: 'SETPENCOLOR ';
SETFILLCOLOR: 'SETFILLCOLOR ';
SETSCREENCOLOR: 'SETSCREENCOLOR ';
SETPENSIZE: 'SETPENSIZE ';
REPEAT: 'REPEAT ';

WS: [\r\t\n]+ -> skip;