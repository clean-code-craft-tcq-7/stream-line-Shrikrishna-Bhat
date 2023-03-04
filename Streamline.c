#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "Streamline.h"

int randomNumberArray[50], temparetureSensor[50], socSensor[50];

int main()
{
  int randomNumber;
  
  for (int i=0; i<50; i++)
  {
    randomNumberArray[i] = 0;
    temparetureSensor[i] = 0;
    socSensor[i]         = 0;
  }
  
  for (int i=0; i<50; i++)
  {
      randomNumberArray[i] = (rand() % 100) + 1;
  }

  for (int i=0; i<50; i++)
  {
      printf("Random numbers %d \n",randomNumberArray[i]);
  }
  return 0;
}

int getTemparetureSensorData(int receivedTemp[])
{
  for (int i=0; i<50; i++)
  {
    temparetureSensor[i] = receivedTemp[i];
  }
  return 0;
}
