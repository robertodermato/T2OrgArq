; i=0; count=0; r2=' '*
; msg = "palavra teste"
;
; while(i!=0){   | Pq é valor ascii
;	var = msg.charAt(i)* - ' '*	
;	if (var == 0){
;		Soma();
;	}
;}
; print(count);
;
;
; Soma(){
;	count+=1;
;}
;
; ----- * significa valores em ascii -----


main
	ldi r1,0		 ;r1 = i (0)
	stw r6,0		 ;r6 = count (0)
	ldi r2,32		 ; r2 = ' '
while
	ldi r5,mensagem	 ;r5 = &mensagem
	add r5,r5,r1		 ;r5 = &mensagem[i]
	ldb r4,r5		 ;r4 = mensagem[i]
	add r1,1		 ;i++
	sub r3,r4,r2		 ;r3 = r4-r2 (msg[i] em asci - ' ' em asci)
	bez r3,soma		 ;se r3 = 0, entra em soma
	bnz r4,while		 ;se r4 não for = 0, repete o while

exit
	stw r6,0xf002
	hcf
soma
	add r6,1
	bnz r4,while


mensagem	"Essa é a frase teste"
count	0

; Se inverter a func exit com a soma
; será contado os espaços + 1
; senão, será contado somente os espaços
