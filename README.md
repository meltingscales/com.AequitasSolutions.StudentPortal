## Findings summary

### gitleaks

TODO

### apkurlgrep

TODO

### Snyk SAST

TODO

## Commands

```
adb shell pm path com.axisidp.mobile

adb pull /data/app/~~i4Y8dCzJqsJSNgvXa0aZiQ==/com.axisidp.mobile-BTm9QCqAgoQiVAU0miILLg==/base.apk

~/go/bin/apkurlgrep -a com.axisidp.mobile.apk > apkurlgrep.txt

apktool d com.axisidp.mobile.apk

gitleaks detect --report-path gitleaks.json
```
