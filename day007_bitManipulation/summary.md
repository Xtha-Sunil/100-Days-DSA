<b> Xor </b><br>
a ^ 1 = a'  <br>
a ^ 0 = a  <br>
a ^ a = 0  <br>

<b> Left-Shift </b><br>
a << b = a * 2<sup>b</sup>  <br>
5 << 4 = 5 * 2<sup>4</sup> = 5 * 16 = 80  <br>

<b> Right-Shift </b><br>
a >> b = a / a<sup>b</sup>  <br>
16 >> 4 = 16 / 2<sup>4</sup>  = 16 / 16 = 1  <br>

<b> Negative of a number </b><br>
MSB(Most Significant Bit) is used to indicate +ve or -ve of the number and is given 2's complement

<b> Range of a number </b><br>
For signed range: -2<sup>n-1</sup> to 2<sup>n-1</sup> - 1 <br>
-1 because negative of 0 dont exist 

<b> Proof </b> <br>
For 1 byte memory 0 is stored in 8 bits <br>
i.e 00000000 <br>
2's complement is given by complement of number then add 1: <br>
=> 11111111 + 1 = 100000000 <br>
Here is overflow as memory is 8 bit only so 9th bit 1 is ignored

<b> Fact </b><br>
MSB indicates +ve or -ve <br>
LSB indicates odd or even

