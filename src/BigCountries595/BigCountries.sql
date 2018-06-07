select name, population, area
from World
where area > 3000000
or population > 25000000
#pretty simple ad hoc query I would write every day at work. I didn't know,
#however, that doing a union of two selects was faster than an or statement in
#the where clause. I'll keep that in mind