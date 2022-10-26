# THIS SECTION IS FOR DECLARING DATA USED
.data
	# helloMessage:	.asciiz "Hello world in assembler" # .asciiz 
	# age:  .word  23 # Just an integer value store in memory, aword is of 4 bytes
	# PI: .float 3.14 # for float values
	firstDouble:  .double 2.025
	secondDouble: .double 3.5
	
	
# THIS SECTION IS THE BODY OF THE PROGRAM
.text
	#li $v0, 4 # 4 is the code for loading string of charcater, li loads the var immediately
	#li $v0, 1 # 1 for integer
	# la $a0, helloMessage
	# li $v0, 2 # 2 for floats
	
	# lw $a0, age # lw loads a word 
	#lwc1 $f12, PI # load PI from coprocessor 1, $f12 for first foating point subprogram argument
	ldc1 $f0, firstDouble # load firstDouble into $f0 copressor register
	ldc1 $f2, secondDouble # load secondDouble into $f2 copressor register, the offset is due to the size of double, 
	# firstDouble is implicitly stored in $f0 and $f1 register
	
	li $v0, 3
	add.d $f12, $f0, $f2
	syscall