# Markdown Demo

Markdown is plain text, It's meant to be easily readable -- and writable!

## Advantages

* Easy for anyone to read.
* Widely adopted by various wikis and note-taking apps.
* Natively supported by GitHub.
* Made to be converted to HTML.

## Disadvantages

* Minimal features (by design).
* Does not support syntax highlighting by default.
* Many competing interpreters (such as Github-Flavored Markdown)
* Missing many features (such as line breaks), and the official solution is embed HTML tags.
* _Only_ designed for HTML.
* No ability to create a page break or line-break.[^1]
* No auto-generated table of contents or index.

[^1]: Although you can add horizontal lines. (And footnotes.)

---

## Text Formatting

* You can *emphasize* words.
* Let people know you're **really** serious.
* Put technical values, such as a `variable` or keystroke (`Ctrl+c`) in backticks.

## Lists

We're already used lists, but you can also create numbered lists:

1. This is the first thing.
1. This is the second.
1. This is the third.
1. Auto-numbering for the win!

## Links

Any URL will automatically become a link: https://example.com
Or, give it a name: [demo site](https://example.com)

## Code

Now let's add some code:

    def main():
        # this is a comment
        print('hello)

There is an alternative way to write code, called "code-fencing":

```
def main():
    # this is a comment
    print('hello)
```

There is _no_ syntax highlighting in Markdown by default, but some third-party converters support it. This text is being compiled with `pandoc`, which supports syntax highlighting. Let's demonstrate.

```python
def main():
    # this is a comment
    print('hello)
```

## Images

![cat.png](cat.png)

## Tables

|header 1|header 2|
|---|---|
|val 1|val 2|
|val 3|val 4|

## Alignment

|Name|Age|
|:---|---:|
|Fred|16|
|Barney|18|

## Checklists

Simple lists:

- [x] This thing is done
- [ ] New task
- [ ] Wash car
- [x] Do laundry
- [ ] Grocery shopping

