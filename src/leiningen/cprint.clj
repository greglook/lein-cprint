(ns leiningen.cprint
  (:require
    [puget.printer :as puget]))


(defn ^:no-project-needed cprint
  "Pretty-print the project map with colorization."
  [project & args]
  (if (seq args)
    (doseq [arg args]
      (let [k (read-string arg)]
        (if (sequential? k)
          (puget/cprint (get-in project k))
          (puget/cprint (get project k)))))
    (puget/cprint project))
  (flush))
