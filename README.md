# LeetCode solutions

My accepted LeetCode submissions, written in **Java** and synced here automatically. Every time I get a problem accepted, the solution lands in this repo by the next morning, with no manual copying.

**70 problems so far** (as of 5 October 2026), and counting.

## What's in here

Everything lives in the [`solutions`](solutions) folder, one folder per problem, named by problem number and title:

```text
solutions/
├── 0001-two-sum/
│   ├── README.md        the problem statement
│   └── solution.java    my accepted solution
├── 0007-reverse-integer/
├── 0009-palindrome-number/
└── ...
```

The folders sort by problem number, so browsing [`solutions`](solutions) lists them in order.

Each solution is its own commit, and the commit message records how the submission performed, for example:

```text
Sync LeetCode: Runtime - 2 ms (74.95%), Memory - 63.1 MB (17.08%)
```

The percentages are LeetCode's "beats" figures at the time of submission. If I solve the same problem again on a later day, the newer solution replaces the file and the earlier one stays in the commit history.

## How the sync works

A GitHub Actions workflow, [`.github/workflows/sync.yml`](.github/workflows/sync.yml), runs every day at 08:00 IST (and on demand from the Actions tab). It uses the [`joshcai/leetcode-sync`](https://github.com/joshcai/leetcode-sync) action to:

1. Log in to LeetCode with a session stored as encrypted repository secrets.
2. Fetch every accepted submission that isn't in the repo yet.
3. Commit each one to its problem folder.

The secrets are never written to the repo or the logs; only their names appear in the workflow file.

## Setting this up for your own account

1. Create a repo and copy [`.github/workflows/sync.yml`](.github/workflows/sync.yml) into it.
2. Log in to LeetCode in your browser, open the developer tools, and copy the values of the `csrftoken` and `LEETCODE_SESSION` cookies.
3. In the repo's **Settings → Secrets and variables → Actions**, add them as `LEETCODE_CSRF_TOKEN` and `LEETCODE_SESSION`.
4. Run the workflow once from the Actions tab to import your full history.

The cookies expire after a few weeks. When the daily run starts failing, repeat steps 2 and 3 with fresh values.

## Notes

- Problem statements in the per-problem README files are LeetCode's and are included only for reference alongside my solutions.
- Solutions are what was accepted at the time, not necessarily the most optimal approach; the commit history shows where I came back and improved one.
