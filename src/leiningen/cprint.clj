(ns leiningen.cprint
  (:require
    [puget.printer :as puget]))


(defn cprint
  "Pretty-print the project map with colorization."
  [project & args]
  (if (seq args)
    (doseq [k args]
      (puget/cprint (project (read-string k))))
    (puget/cprint project))
  (flush))
