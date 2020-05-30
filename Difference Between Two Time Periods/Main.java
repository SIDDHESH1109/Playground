#include<stdio.h>

struct TIME{
	int seconds,minutes,hours;
};

void differenceBetweenTimePeriod(struct TIME t1, struct TIME t2, struct TIME *diff);

int main()
{
  //Type your code here.
  	struct TIME startTime, stopTime ,diff;
  scanf("%d %d %d",&startTime.hours, &startTime.minutes, &startTime.seconds);
  scanf("%d %d %d",&stopTime.hours, &stopTime.minutes, &stopTime.seconds);
  differenceBetweenTimePeriod(startTime, stopTime, &diff);
  
  printf("%d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
  return 0;
}

void differenceBetweenTimePeriod(struct TIME start, struct TIME stop, struct TIME *diff){
		while(stop.seconds>start.seconds){
        	--start.minutes;
          	start.seconds += 60;
        }
  		diff->seconds = start.seconds - stop.seconds;
  		while(stop.minutes>start.minutes){
        	--start.hours;
          	start.minutes += 60;
        }
		diff->minutes = start.minutes - stop.minutes;
  		diff->hours = start.hours - stop.hours;
}