#!/usr/bin/env bash
# brew install ktlint & pandoc for this to work
rm -rf docs epub
./gradlew build dokkaHtml 
cd epub
sh create_ebook.sh
cp book.epub ..
