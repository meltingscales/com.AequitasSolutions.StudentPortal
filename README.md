## Findings summary

### gitleaks

TODO

### apkurlgrep

Nothing found.

### Snyk SAST

TODO

## Commands

```
adb shell pm path com.axisidp.mobile

adb pull /data/app/~~i4Y8dCzJqsJSNgvXa0aZiQ==/com.axisidp.mobile-BTm9QCqAgoQiVAU0miILLg==/base.apk

~/go/bin/apkurlgrep -a com.AequitasSolutions.StudentPortal.apk > apkurlgrep.txt

apktool d com.AequitasSolutions.StudentPortal.apk

echo "then, make a commit so gitleaks can detect it..."

gitleaks detect --report-path gitleaks.json
```
