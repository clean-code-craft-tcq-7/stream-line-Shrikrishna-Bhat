#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "Streamline.h"

int main()
{
  int randomNumber, randomNumberArray[15];
    
  for (int i=0; i<50; i++)
  {
      randomNumberArray[i] = (rand() % 100) + 1;
  }

  for (int i=0; i<15; i++)
  {
      printf("Random numbers %d \n",randomNumberArray[i]);
  }
  return 0;
}
