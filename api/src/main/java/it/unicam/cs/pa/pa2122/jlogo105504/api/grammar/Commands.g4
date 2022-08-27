grammar Commands;

@header {
package it.unicam.cs.pa.pa2122.jlogo105504.api.antlr;
}

logo: sequenceInstruction EOF;

sequenceInstruction: instruction+ ;

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
    | repeat
    ;

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

repeat: REPEAT NUMBER sequenceInstructionRepeat ?EXIT;
sequenceInstructionRepeat: instruction+;

fragment FD: ('FORWARD ' | 'FD '| 'forward ' | 'fd ');
fragment BK: ('BACKWARD ' | 'BD '| 'backward ' | 'bd ');
fragment LT: ('LEFT ' | 'LF ' | 'left ' | 'lf ');
fragment RT: ('RIGHT ' | 'RT '| 'right ' | 'rt ');
fragment CLS: ('CLEARSCREEN' | 'CLS' | 'clearscreen' | 'cls');
fragment HM: ('HOME' | 'HM' | 'home' | 'hm');
fragment PU: ('PENUP' | 'PU' | 'penup' | 'pu');
fragment PD: ('PENDOWN' | 'PD' | 'pendown' | 'pd');
fragment SPC: ('SETPENCOLOR' | 'SPC' | 'setpencolor' | 'spc');
fragment SFC: ('SETFILLCOLOR' | 'SFC' | 'setfillcolor' | 'sfc');
fragment SSC: ('SETSCREENCOLOR' | 'SSC' | 'setscreencolor' | 'ssc');
fragment SPS: ('SETPENSIZE' | 'SPS' | 'setpensize' | 'sps');
fragment RP: ('REPEAT ' | 'RP' | 'repeat' | 'rp');
fragment INTEGER: ('0' .. '9');
fragment EX: ('EXIT' | 'EX' | 'exit' | 'ex' );


FORWARD: FD;
BACKWARD: BK;
LEFT: LT;
RIGHT: RT;
CLEARSCREEN: CLS;
HOME: HM;
PENUP: PU;
PENDOWN: PD;
SETPENCOLOR: SPC;
SETFILLCOLOR: SFC;
SETSCREENCOLOR: SSC;
SETPENSIZE: SPS;
REPEAT: RP;
NUMBER: INTEGER+ ('.' INTEGER+)?;
EXIT: EX;

NEWLINE: '\r'? '\n' -> skip;
WS: ' '+ -> skip;
COMMENT: '//' ~[\n]* -> skip;