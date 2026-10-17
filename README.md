# LeetCode solutions

My accepted LeetCode submissions, written in **Java**. When I get a problem accepted, [LeetSync](https://github.com/LeetSync/LeetSync) pushes the solution here straight away. I don't copy anything by hand.

**75 problems so far** (as of 17 October 2026), and counting.

## What's in here

Everything is in the [`solutions`](solutions) folder. Each problem has its own folder, named by problem number and title:

```text
solutions/
├── 0001-two-sum/
│   ├── README.md        the problem statement
│   └── solution.java    my accepted solution
├── 0007-reverse-integer/
├── 0009-palindrome-number/
└── ...
```

The folders sort by problem number, so [`solutions`](solutions) lists them in order.

Each accepted submission is its own commit, and the commit message records how it performed: runtime and memory, plus LeetCode's "beats" percentages at the time. If I solve the same problem again later, the newer solution replaces the old one, which stays in the commit history.

## How the sync works

[LeetSync](https://github.com/LeetSync/LeetSync) is a Chrome extension. Once it's linked to GitHub and pointed at this repo's `solutions` folder, it watches for accepted submissions on leetcode.com and commits each one as soon as LeetCode accepts it. It needs no LeetCode cookies, repository secrets or scheduled jobs.

Solutions up to early October 2026 were imported by an earlier GitHub Actions workflow, which has since been removed. Their commits start with `Sync LeetCode:`.

## Setting this up for your own account

1. Create an empty GitHub repo.
2. Install the LeetSync extension from the Chrome Web Store.
3. Open the extension, sign in with GitHub, and choose the repo (and a folder in it if you want one).
4. Solve a problem on leetcode.com. Once it's accepted, the solution shows up in the repo.

## Notes

- The problem statements in the per-problem README files belong to LeetCode. I include them only for reference next to my solutions.
- Each solution is what LeetCode accepted at the time, not necessarily the best approach. The commit history shows where I came back and improved one.
