package FindTheTwonJudge997;

public class FindTheTownJudge {
    public static int findJudge(int n, int[][] trust){
        int[] people = new int[n];

        for(int[] relationship : trust){
            people[relationship[0] - 1] -= 1;
            people[relationship[1] - 1] += 1;
        }

        for(int i = 0; i < n; i++){
            if(people[i] == n - 1){
                return i + 1;
            }
        }

        return -1;
    }
}

/**
 * Pre-implementation notes:
 *
 * We know the judge cannot trust anybody.
 * We know if two different people in town are trusted, there is no judge.
 *
 * All we have to do is store the value of the first townsperson as the judge, then check if any other townsperson
 * trusts a different person than the judge. You also test if the townsperson trusts everyone. This should give you
 * linear time and constant storage.
 *
 * judge = int[0][1]
 * for person in trust
 *      if person[1] != judge || person[0] == judge
 *          return -1
 *
 * if trust.length < n
 *      return -1
 *
 * return judge
 */

/**
 * Pre-implementation after realizing mistake:
 *
 * We know that the judge must be trusted by everyone in town and cannot trust anyone. TOWNSPEOPLE CAN TRUST MULTIPLE
 * PEOPLE.
 *
 * In order to find the judge, we need to know how many people trust each townsperson. We can track this via an array.
 * However, we also need to know if this person trusts anybody else. This can be done by having a separate array that
 * keeps track of how many people the current person trusts. Because we know there are n people and each person is
 * represented by a number, we can make arrays of size n and have each value represent how many people trust them and
 * how many people they trust. If any one index both trusts no one and is trusted by n-1 people (the amount of people
 * needed to be trusted by in order to be the judge), they are the judge. Otherwise, there is no judge.
 *
 * We can do better, however, by only storing one array counting upwards for each person that trusts the person at index
 * i, and decrementing for each townsperson the person at index i trusts. This way, we still check if the person at
 * index i has a value of n - 1 because this person should not trust anyone if they are the judge, thus should not
 * decrement. This saves us one array of length n, which reduces the space complexity by a factor of 2. Still better but
 * not an insane increase in storage. We can't early terminate if we reach the n - 1 threshold because it isn't
 * guaranteed the trust list is sorted, so one person may reach the n - 1 threshold and later down the line, we find
 * they trust another individual.
 *
 * array people = new array[n]
 * for(int[] edge : trust)
 *      people[edge[0] - 1] -= 1
 *      people[edge[1] - 1] += 1
 *
 * for(int i = 0; i < n - 1; i++)
 *      if(people[i] == n - 1)
 *          return i + 1
 *
 * return -1
 */

/**
 * Reflection:
 *
 * This is the first problem that had many criteria that I had to understand and misunderstanding one piece can lead to
 * a drastically different solution. Here is where asking clarifying questions would help monumentally, but because
 * leetcode doesn't have that feature by nature of being a quiz site and not a conversation, I messed up. I was able to
 * identify before making my first submission I had misunderstood, which is a positive, but I definitely need to make
 * note of any features a problem has before trying to create a solution. Possibly taking notes of these so I fully
 * understand. Especially with Graph problems.
 */